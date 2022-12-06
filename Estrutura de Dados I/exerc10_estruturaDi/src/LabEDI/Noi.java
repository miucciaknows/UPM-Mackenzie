/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabEDI;

/**
 *
 * @author nath
 * 41714849
 */ 

public class Noi {
    public Noi esquerdai;
    public Noi direitai;
    public Noi paii;
    public int chavei;
    public int balanceamentoi;
    
    public Noi(int ki) {
        setEsquerdai(setDireitai(setPaii(null)));
	setBalanceamentoi(0);
	setChavei(ki);
}

    public String toString() {
	return Integer.toString(getChavei());
}

    public int getChavei() {
        return chavei;
 }

    public void setChavei(int chavei) {
        this.chavei = chavei;
}

    public int getBalanceamentoi() {
        return balanceamentoi;
}

    public void setBalanceamentoi(int balanceamentoi) {
        this.balanceamentoi = balanceamentoi;
}

    public Noi getPaii() {
        return paii;
}

    public Noi setPaii(Noi paii) {
	this.paii = paii;
	return paii;
}

    public Noi getDireitai() {
	return direitai;
}

    public Noi setDireitai(Noi direitai) {
	this.direitai = direitai;
	return direitai;
}

    public Noi getEsquerdai() {
	return esquerdai;
}

    public void setEsquerdai(Noi esquerdai) {
	this.esquerdai = esquerdai;

}
    
}
