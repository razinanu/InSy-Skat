package com.example.insy_skat;

import android.app.Application;

public class saveGlobalVariable extends Application {

	private int factor;
	private boolean kreuz, pik, herz, karo, grand, nullsp,nullh,nullou,nullouh;

	public boolean isNullsp() {
		return nullsp;
	}

	public void setNullsp(boolean nullsp) {
		this.nullsp = nullsp;
	}

	public boolean isNullh() {
		return nullh;
	}

	public void setNullh(boolean nullh) {
		this.nullh = nullh;
	}

	public boolean isNullou() {
		return nullou;
	}

	public void setNullou(boolean nullou) {
		this.nullou = nullou;
	}

	public boolean isNullouh() {
		return nullouh;
	}

	public void setNullouh(boolean nullouh) {
		this.nullouh = nullouh;
	}

	public int getFactor() {
		return factor;
	}

	public void setFactor(int factor) {
		this.factor = factor;
	}

	public boolean isKreuz() {
		return kreuz;
	}

	public void setKreuz(boolean kreuz) {
		this.kreuz = kreuz;
	}

	public boolean isPik() {
		return pik;
	}

	public void setPik(boolean pik) {
		this.pik = pik;
	}

	public boolean isHerz() {
		return herz;
	}

	public void setHerz(boolean herz) {
		this.herz = herz;
	}

	public boolean isKaro() {
		return karo;
	}

	public void setKaro(boolean karo) {
		this.karo = karo;
	}

	public boolean isGrand() {
		return grand;
	}

	public void setGrand(boolean grand) {
		this.grand = grand;
	}

}
