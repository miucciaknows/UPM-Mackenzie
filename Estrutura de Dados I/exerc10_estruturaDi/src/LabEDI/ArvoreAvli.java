/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEDI;

import java.util.ArrayList;

/**
 *
 * @author nath
 * 41714849
 */

public class ArvoreAvli {
    public Noi raizi;

	public void inseriri(int ki) {
		Noi ni = new Noi(ki);
		inserirAVLi(this.raizi, ni);
	}

	public void inserirAVLi(Noi aComparari, Noi aInseriri) {

		if (aComparari == null) {
			this.raizi = aInseriri;

		} else {

			if (aInseriri.getChavei() < aComparari.getChavei()) {

				if (aComparari.getEsquerdai() == null) {
					aComparari.setEsquerdai(aInseriri);
					aInseriri.setPaii(aComparari);
					verificarBalanceamentoi(aComparari);

				} else {
					inserirAVLi(aComparari.getEsquerdai(), aInseriri);
				}

			} else if (aInseriri.getChavei() > aComparari.getChavei()) {

				if (aComparari.getDireitai() == null) {
					aComparari.setDireitai(aInseriri);
					aInseriri.setPaii(aComparari);
					verificarBalanceamentoi(aComparari);

				} else {
					inserirAVLi(aComparari.getDireitai(), aInseriri);
				}

			} else {
				System.out.println("O Nó já existe!");
                                
			}
		}
	}

	public void verificarBalanceamentoi(Noi atuali) {
		setBalanceamentoi(atuali);
		int balanceamentoi = atuali.getBalanceamentoi();

		if (balanceamentoi == -2) {

			if (alturai(atuali.getEsquerdai().getEsquerdai()) >= alturai(atuali.getEsquerdai().getDireitai())) {
				atuali = rotacaoDireitai(atuali);

			} else {
				atuali = duplaRotacaoEsquerdaDireitai(atuali);
			}

		} else if (balanceamentoi == 2) {

			if (alturai(atuali.getDireitai().getDireitai()) >= alturai(atuali.getDireitai().getEsquerdai())) {
				atuali = rotacaoEsquerdai(atuali);

			} else {
				atuali = duplaRotacaoDireitaEsquerdai(atuali);
			}
		}

		if (atuali.getPaii() != null) {
			verificarBalanceamentoi(atuali.getPaii());
		} else {
			this.raizi = atuali;
		}
	}

	public void removeri(int ki) {
		removerAVLi(this.raizi, ki);
	}

	public void removerAVLi(Noi atuali, int ki) {
		if (atuali == null) {
			return;

		} else {

			if (atuali.getChavei() > ki) {
				removerAVLi(atuali.getEsquerdai(), ki);

			} else if (atuali.getChavei() < ki) {
				removerAVLi(atuali.getDireitai(), ki);

			} else if (atuali.getChavei() == ki) {
				removerNoEncontradoi(atuali);
			}
		}
	}

	public void removerNoEncontradoi(Noi aRemoveri) {
		Noi ri;

		if (aRemoveri.getEsquerdai() == null || aRemoveri.getDireitai() == null) {

			if (aRemoveri.getPaii() == null) {
				this.raizi = null;
				aRemoveri = null;
				return;
			}
			ri = aRemoveri;

		} else {
			ri = sucessori(aRemoveri);
			aRemoveri.setChavei(ri.getChavei());
		}

		Noi pi;
		if (ri.getEsquerdai() != null) {
			pi = ri.getEsquerdai();
		} else {
			pi = ri.getDireitai();
		}

		if (pi != null) {
			pi.setPaii(ri.getPaii());
		}

		if (ri.getPaii() == null) {
			this.raizi = pi;
		} else {
			if (ri == ri.getPaii().getEsquerdai()) {
				ri.getPaii().setEsquerdai(pi);
			} else {
				ri.getPaii().setDireitai(pi);
			}
			verificarBalanceamentoi(ri.getPaii());
		}
		ri = null;
	}

	public Noi rotacaoEsquerdai(Noi iniciali) {

		Noi direitai = iniciali.getDireitai();
		direitai.setPaii(iniciali.getPaii());

		iniciali.setDireitai(direitai.getEsquerdai());

		if (iniciali.getDireitai() != null) {
			iniciali.getDireitai().setPaii(iniciali);
		}

		direitai.setEsquerdai(iniciali);
		iniciali.setPaii(direitai);

		if (direitai.getPaii() != null) {

			if (direitai.getPaii().getDireitai() == iniciali) {
				direitai.getPaii().setDireitai(direitai);
			
			} else if (direitai.getPaii().getEsquerdai() == iniciali) {
				direitai.getPaii().setEsquerdai(direitai);
			}
		}

		setBalanceamentoi(iniciali);
		setBalanceamentoi(direitai);

		return direitai;
	}

	public Noi rotacaoDireitai(Noi iniciali) {

		Noi esquerdai = iniciali.getEsquerdai();
		esquerdai.setPaii(iniciali.getPaii());

		iniciali.setEsquerdai(esquerdai.getDireitai());

		if (iniciali.getEsquerdai() != null) {
			iniciali.getEsquerdai().setPaii(iniciali);
		}

		esquerdai.setDireitai(iniciali);
		iniciali.setPaii(esquerdai);

		if (esquerdai.getPaii() != null) {

			if (esquerdai.getPaii().getDireitai() == iniciali) {
				esquerdai.getPaii().setDireitai(esquerdai);
			
			} else if (esquerdai.getPaii().getEsquerdai() == iniciali) {
				esquerdai.getPaii().setEsquerdai(esquerdai);
			}
		}

		setBalanceamentoi(iniciali);
		setBalanceamentoi(esquerdai);

		return esquerdai;
	}

	public Noi duplaRotacaoEsquerdaDireitai(Noi iniciali) {
		iniciali.setEsquerdai(rotacaoEsquerdai(iniciali.getEsquerdai()));
		return rotacaoDireitai(iniciali);
	}

	public Noi duplaRotacaoDireitaEsquerdai(Noi iniciali) {
		iniciali.setDireitai(rotacaoDireitai(iniciali.getDireitai()));
		return rotacaoEsquerdai(iniciali);
	}

	public Noi sucessori(Noi qi) {
		if (qi.getDireitai() != null) {
			Noi ri = qi.getDireitai();
			while (ri.getEsquerdai() != null) {
				ri = ri.getEsquerdai();
			}
			return ri;
		} else {
			Noi pi = qi.getPaii();
			while (pi != null && qi == pi.getDireitai()) {
				qi = pi;
				pi = qi.getPaii();
			}
			return pi;
		}
	}

	public int alturai(Noi atuali) {
		if (atuali == null) {
			return -1;
		}

		if (atuali.getEsquerdai() == null && atuali.getDireitai() == null) {
			return 0;
		
		} else if (atuali.getEsquerdai() == null) {
			return 1 + alturai(atuali.getDireitai());
		
		} else if (atuali.getDireitai() == null) {
			return 1 + alturai(atuali.getEsquerdai());
		
		} else {
			return 1 + Math.max(alturai(atuali.getEsquerdai()), alturai(atuali.getDireitai()));
		}
	}
        public void setBalanceamentoi(Noi noi) {
		noi.setBalanceamentoi(alturai(noi.getDireitai()) - alturai(noi.getEsquerdai()));
	}

	final public ArrayList<Noi> inorderi() {
		ArrayList<Noi> reti = new ArrayList<Noi>();
		inorderi(raizi, reti);
		return reti;
	}

	final public void inorderi(Noi noi, ArrayList<Noi> listai) {
		if (noi == null) {
			return;
		}
		inorderi(noi.getEsquerdai(), listai);
		listai.add(noi);
		inorderi(noi.getDireitai(), listai);
	}
	
	public void printAvli() {
		printAvli(raizi);
	}
	
	public void printAvli(Noi noAtuali) {
		
		System.out.print("( " + noAtuali.getChavei());
		
		if(noAtuali.getEsquerdai() != null) {
			printAvli(noAtuali.getEsquerdai());
		}else {
			System.out.print("()");
		}
		
		if(noAtuali.getDireitai() != null) {
			printAvli(noAtuali.getDireitai());
		}else {
			System.out.print("()");
		}
		System.out.print(" )");
		
	}
	
        
    
}