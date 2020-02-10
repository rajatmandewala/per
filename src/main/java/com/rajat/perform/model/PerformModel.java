package com.rajat.perform.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PERFORM")
public class PerformModel {
	
			@Id
			@GeneratedValue(strategy=GenerationType.IDENTITY)
			@Column
			private Integer SRNO; 
			@Column
			private String SCHEMENAME;
			
			@Column
			private String DIVIDEND;
			
			@Column
			private String GROWTH ;			
			
			@Column
			private String DAY1 ;
			@Column
			private String DAY7 ;
			@Column
			private String DAY15 ;
			@Column
			private String MONTH1 ;
			@Column
			private String MONTH3 ;
			@Column
			private String MONTH6 ;
			@Column
			private String YEAR1 ;
			@Column
			private String YEAR2 ;
			@Column
			private String YEAR3 ;
			@Column
			private String YEAR4 ;
			@Column
			private String YEAR5 ;
			@Column
			private String YEAR6 ;
			@Column
			private String YEAR7 ;
			@Column
			private String YEAR8 ;
			@Column
			private String YEAR9 ;
			@Column
			private String YEAR10 ;
			@Column
			private String YEAR11 ;
			@Column
			private String YEAR12 ;
			@Column
			private String YEAR13 ;
			@Column
			private String YEAR14 ;
			@Column
			private String YEAR15 ;
			@Column
			private String YEAR20 ;
			@Column
			private String YEARSI ;
			@Column
			private String DAY1ANN ;
			@Column
			private String DAY7ANN ;
			@Column
			private String DAY15ANN ;			
			@Column			
			private String MONTH1ANN ;			
			@Column
			private String MONTH3ANN ;
			@Column
			private String MONTH6ANN ;
			@Column
			private String DAY1TOTAL ;
			@Column
			private String DAY7TOTAL ;
			@Column
			private String DAY15TOTAL ;
			@Column
			private String MONTH1TOTAL ;
			@Column
			private String	MONTH3TOTAL ;
			@Column
			private String	MONTH6TOTAL ;
			@Column
			private String	YEAR1TOTAL ;			
			@Column
			private String	YEAR2TOTAL ;
			@Column
			private String	YEAR3TOTAL ;
			@Column
			private String	YEAR4TOTAL ;
			@Column
			private String	YEAR5TOTAL ;
			@Column
			private String	YEAR6TOTAL ;
			@Column
			private String	YEAR7TOTAL ;
			@Column
			private String	YEAR8TOTAL ;
			@Column
			private String	YEAR9TOTAL ;
			@Column
			private String	YEAR10TOTAL ;
			@Column
			private String	YEAR11TOTAL ;
			@Column
			private String	YEAR12TOTAL ;
			@Column
			private String	YEAR13TOTAL ;
			@Column
			private String	YEAR14TOTAL ;
			@Column
			private String	YEAR15TOTAL ;
			@Column
			private String	YEAR20TOTAL ;
			@Column
			private String	YEARSITOTAL ;
			@Column
			private String	DAY1ANNTOTAL ;
			@Column
			private String	DAY7ANNTOTAL ;
			@Column
			private String	DAY15ANNTOTAL ;
			@Column
			private String	MONTH1ANNTOTAL ;
			@Column
			private String	MONTH3ANNTOTAL ;			
			@Column
			private String MONTH6ANNTOTAL;
			
			public Integer getSRNO() {
				return SRNO;
			}
			public void setSRNO(Integer sRNO) {
				SRNO = sRNO;
			}
			public String getSCHEMENAME() {
				return SCHEMENAME;
			}
			public void setSCHEMENAME(String sCHEMENAME) {
				SCHEMENAME = sCHEMENAME;
			}
			public String getDAY1() {
				return DAY1;
			}
			public void setDAY1(String dAY1) {
				DAY1 = dAY1;
			}
			public String getDAY7() {
				return DAY7;
			}
			public void setDAY7(String dAY7) {
				DAY7 = dAY7;
			}
			public String getDAY15() {
				return DAY15;
			}
			public void setDAY15(String dAY15) {
				DAY15 = dAY15;
			}
			public String getMONTH1() {
				return MONTH1;
			}
			public void setMONTH1(String mONTH1) {
				MONTH1 = mONTH1;
			}
			public String getMONTH3() {
				return MONTH3;
			}
			public void setMONTH3(String mONTH3) {
				MONTH3 = mONTH3;
			}
			public String getMONTH6() {
				return MONTH6;
			}
			public void setMONTH6(String mONTH6) {
				MONTH6 = mONTH6;
			}
			public String getYEAR1() {
				return YEAR1;
			}
			public void setYEAR1(String yEAR1) {
				YEAR1 = yEAR1;
			}
			public String getYEAR2() {
				return YEAR2;
			}
			public void setYEAR2(String yEAR2) {
				YEAR2 = yEAR2;
			}
			public String getYEAR3() {
				return YEAR3;
			}
			public void setYEAR3(String yEAR3) {
				YEAR3 = yEAR3;
			}
			public String getYEAR4() {
				return YEAR4;
			}
			public void setYEAR4(String yEAR4) {
				YEAR4 = yEAR4;
			}
			public String getYEAR5() {
				return YEAR5;
			}
			public void setYEAR5(String yEAR5) {
				YEAR5 = yEAR5;
			}
			public String getYEAR6() {
				return YEAR6;
			}
			public void setYEAR6(String yEAR6) {
				YEAR6 = yEAR6;
			}
			public String getYEAR7() {
				return YEAR7;
			}
			public void setYEAR7(String yEAR7) {
				YEAR7 = yEAR7;
			}
			public String getYEAR8() {
				return YEAR8;
			}
			public void setYEAR8(String yEAR8) {
				YEAR8 = yEAR8;
			}
			public String getYEAR9() {
				return YEAR9;
			}
			public void setYEAR9(String yEAR9) {
				YEAR9 = yEAR9;
			}
			public String getYEAR10() {
				return YEAR10;
			}
			public void setYEAR10(String yEAR10) {
				YEAR10 = yEAR10;
			}
			public String getYEAR11() {
				return YEAR11;
			}
			public void setYEAR11(String yEAR11) {
				YEAR11 = yEAR11;
			}
			public String getYEAR12() {
				return YEAR12;
			}
			public void setYEAR12(String yEAR12) {
				YEAR12 = yEAR12;
			}
			public String getYEAR13() {
				return YEAR13;
			}
			public void setYEAR13(String yEAR13) {
				YEAR13 = yEAR13;
			}
			public String getYEAR14() {
				return YEAR14;
			}
			public void setYEAR14(String yEAR14) {
				YEAR14 = yEAR14;
			}
			public String getYEAR15() {
				return YEAR15;
			}
			public void setYEAR15(String yEAR15) {
				YEAR15 = yEAR15;
			}
			public String getYEAR20() {
				return YEAR20;
			}
			public void setYEAR20(String yEAR20) {
				YEAR20 = yEAR20;
			}
			public String getYEARSI() {
				return YEARSI;
			}
			public void setYEARSI(String yEARSI) {
				YEARSI = yEARSI;
			}
			public String getDAY1ANN() {
				return DAY1ANN;
			}
			public void setDAY1ANN(String dAY1ANN) {
				DAY1ANN = dAY1ANN;
			}
			public String getDAY7ANN() {
				return DAY7ANN;
			}
			public void setDAY7ANN(String dAY7ANN) {
				DAY7ANN = dAY7ANN;
			}
			public String getDAY15ANN() {
				return DAY15ANN;
			}
			public void setDAY15ANN(String dAY15ANN) {
				DAY15ANN = dAY15ANN;
			}
			public String getMONTH1ANN() {
				return MONTH1ANN;
			}
			public void setMONTH1ANN(String mONTH1ANN) {
				MONTH1ANN = mONTH1ANN;
			}
			public String getMONTH3ANN() {
				return MONTH3ANN;
			}
			public void setMONTH3ANN(String mONTH3ANN) {
				MONTH3ANN = mONTH3ANN;
			}
			public String getMONTH6ANN() {
				return MONTH6ANN;
			}
			public void setMONTH6ANN(String mONTH6ANN) {
				MONTH6ANN = mONTH6ANN;
			}
			public String getDAY1TOTAL() {
				return DAY1TOTAL;
			}
			public void setDAY1TOTAL(String dAY1TOTAL) {
				DAY1TOTAL = dAY1TOTAL;
			}
			public String getDAY7TOTAL() {
				return DAY7TOTAL;
			}
			public void setDAY7TOTAL(String dAY7TOTAL) {
				DAY7TOTAL = dAY7TOTAL;
			}
			public String getDAY15TOTAL() {
				return DAY15TOTAL;
			}
			public void setDAY15TOTAL(String dAY15TOTAL) {
				DAY15TOTAL = dAY15TOTAL;
			}
			public String getMONTH1TOTAL() {
				return MONTH1TOTAL;
			}
			public void setMONTH1TOTAL(String mONTH1TOTAL) {
				MONTH1TOTAL = mONTH1TOTAL;
			}
			public String getMONTH3TOTAL() {
				return MONTH3TOTAL;
			}
			public void setMONTH3TOTAL(String mONTH3TOTAL) {
				MONTH3TOTAL = mONTH3TOTAL;
			}
			public String getMONTH6TOTAL() {
				return MONTH6TOTAL;
			}
			public void setMONTH6TOTAL(String mONTH6TOTAL) {
				MONTH6TOTAL = mONTH6TOTAL;
			}
			public String getYEAR1TOTAL() {
				return YEAR1TOTAL;
			}
			public void setYEAR1TOTAL(String yEAR1TOTAL) {
				YEAR1TOTAL = yEAR1TOTAL;
			}
			public String getYEAR2TOTAL() {
				return YEAR2TOTAL;
			}
			public void setYEAR2TOTAL(String yEAR2TOTAL) {
				YEAR2TOTAL = yEAR2TOTAL;
			}
			public String getYEAR3TOTAL() {
				return YEAR3TOTAL;
			}
			public void setYEAR3TOTAL(String yEAR3TOTAL) {
				YEAR3TOTAL = yEAR3TOTAL;
			}
			public String getYEAR4TOTAL() {
				return YEAR4TOTAL;
			}
			public void setYEAR4TOTAL(String yEAR4TOTAL) {
				YEAR4TOTAL = yEAR4TOTAL;
			}
			public String getYEAR5TOTAL() {
				return YEAR5TOTAL;
			}
			public void setYEAR5TOTAL(String yEAR5TOTAL) {
				YEAR5TOTAL = yEAR5TOTAL;
			}
			public String getYEAR6TOTAL() {
				return YEAR6TOTAL;
			}
			public void setYEAR6TOTAL(String yEAR6TOTAL) {
				YEAR6TOTAL = yEAR6TOTAL;
			}
			public String getYEAR7TOTAL() {
				return YEAR7TOTAL;
			}
			public void setYEAR7TOTAL(String yEAR7TOTAL) {
				YEAR7TOTAL = yEAR7TOTAL;
			}
			public String getYEAR8TOTAL() {
				return YEAR8TOTAL;
			}
			public void setYEAR8TOTAL(String yEAR8TOTAL) {
				YEAR8TOTAL = yEAR8TOTAL;
			}
			public String getYEAR9TOTAL() {
				return YEAR9TOTAL;
			}
			public void setYEAR9TOTAL(String yEAR9TOTAL) {
				YEAR9TOTAL = yEAR9TOTAL;
			}
			public String getYEAR10TOTAL() {
				return YEAR10TOTAL;
			}
			public void setYEAR10TOTAL(String yEAR10TOTAL) {
				YEAR10TOTAL = yEAR10TOTAL;
			}
			public String getYEAR11TOTAL() {
				return YEAR11TOTAL;
			}
			public void setYEAR11TOTAL(String yEAR11TOTAL) {
				YEAR11TOTAL = yEAR11TOTAL;
			}
			public String getYEAR12TOTAL() {
				return YEAR12TOTAL;
			}
			public void setYEAR12TOTAL(String yEAR12TOTAL) {
				YEAR12TOTAL = yEAR12TOTAL;
			}
			public String getYEAR13TOTAL() {
				return YEAR13TOTAL;
			}
			public void setYEAR13TOTAL(String yEAR13TOTAL) {
				YEAR13TOTAL = yEAR13TOTAL;
			}
			public String getYEAR14TOTAL() {
				return YEAR14TOTAL;
			}
			public void setYEAR14TOTAL(String yEAR14TOTAL) {
				YEAR14TOTAL = yEAR14TOTAL;
			}
			public String getYEAR15TOTAL() {
				return YEAR15TOTAL;
			}
			public void setYEAR15TOTAL(String yEAR15TOTAL) {
				YEAR15TOTAL = yEAR15TOTAL;
			}
			public String getYEAR20TOTAL() {
				return YEAR20TOTAL;
			}
			public void setYEAR20TOTAL(String yEAR20TOTAL) {
				YEAR20TOTAL = yEAR20TOTAL;
			}
			public String getYEARSITOTAL() {
				return YEARSITOTAL;
			}
			public void setYEARSITOTAL(String yEARSITOTAL) {
				YEARSITOTAL = yEARSITOTAL;
			}
			public String getDAY1ANNTOTAL() {
				return DAY1ANNTOTAL;
			}
			public void setDAY1ANNTOTAL(String dAY1ANNTOTAL) {
				DAY1ANNTOTAL = dAY1ANNTOTAL;
			}
			public String getDAY7ANNTOTAL() {
				return DAY7ANNTOTAL;
			}
			public void setDAY7ANNTOTAL(String dAY7ANNTOTAL) {
				DAY7ANNTOTAL = dAY7ANNTOTAL;
			}
			public String getDAY15ANNTOTAL() {
				return DAY15ANNTOTAL;
			}
			public void setDAY15ANNTOTAL(String dAY15ANNTOTAL) {
				DAY15ANNTOTAL = dAY15ANNTOTAL;
			}
			public String getMONTH1ANNTOTAL() {
				return MONTH1ANNTOTAL;
			}
			public void setMONTH1ANNTOTAL(String mONTH1ANNTOTAL) {
				MONTH1ANNTOTAL = mONTH1ANNTOTAL;
			}
			public String getMONTH3ANNTOTAL() {
				return MONTH3ANNTOTAL;
			}
			public void setMONTH3ANNTOTAL(String mONTH3ANNTOTAL) {
				MONTH3ANNTOTAL = mONTH3ANNTOTAL;
			}
			public String getMONTH6ANNTOTAL() {
				return MONTH6ANNTOTAL;
			}
			public void setMONTH6ANNTOTAL(String mONTH6ANNTOTAL) {
				MONTH6ANNTOTAL = mONTH6ANNTOTAL;
			}
			
			public String getDIVIDEND() {
				return DIVIDEND;
			}
			public void setDIVIDEND(String dIVIDEND) {
				DIVIDEND = dIVIDEND;
			}
			public String getGROWTH() {
				return GROWTH;
			}
			public void setGROWTH(String gROWTH) {
				GROWTH = gROWTH;
			}
			@Override
			public String toString() {
				return "PerformModel [SRNO=" + SRNO + ", SCHEMENAME=" + SCHEMENAME + ", DAY1=" + DAY1 + ", DAY7=" + DAY7
						+ ", DAY15=" + DAY15 + ", MONTH1=" + MONTH1 + ", MONTH3=" + MONTH3 + ", MONTH6=" + MONTH6
						+ ", YEAR1=" + YEAR1 + ", YEAR2=" + YEAR2 + ", YEAR3=" + YEAR3 + ", YEAR4=" + YEAR4 + ", YEAR5="
						+ YEAR5 + ", YEAR6=" + YEAR6 + ", YEAR7=" + YEAR7 + ", YEAR8=" + YEAR8 + ", YEAR9=" + YEAR9
						+ ", YEAR10=" + YEAR10 + ", YEAR11=" + YEAR11 + ", YEAR12=" + YEAR12 + ", YEAR13=" + YEAR13
						+ ", YEAR14=" + YEAR14 + ", YEAR15=" + YEAR15 + ", YEAR20=" + YEAR20 + ", YEARSI=" + YEARSI
						+ ", DAY1ANN=" + DAY1ANN + ", DAY7ANN=" + DAY7ANN + ", DAY15ANN=" + DAY15ANN + ", MONTH1ANN="
						+ MONTH1ANN + ", MONTH3ANN=" + MONTH3ANN + ", MONTH6ANN=" + MONTH6ANN + ", DAY1TOTAL="
						+ DAY1TOTAL + ", DAY7TOTAL=" + DAY7TOTAL + ", DAY15TOTAL=" + DAY15TOTAL + ", MONTH1TOTAL="
						+ MONTH1TOTAL + ", MONTH3TOTAL=" + MONTH3TOTAL + ", MONTH6TOTAL=" + MONTH6TOTAL
						+ ", YEAR1TOTAL=" + YEAR1TOTAL + ", YEAR2TOTAL=" + YEAR2TOTAL + ", YEAR3TOTAL=" + YEAR3TOTAL
						+ ", YEAR4TOTAL=" + YEAR4TOTAL + ", YEAR5TOTAL=" + YEAR5TOTAL + ", YEAR6TOTAL=" + YEAR6TOTAL
						+ ", YEAR7TOTAL=" + YEAR7TOTAL + ", YEAR8TOTAL=" + YEAR8TOTAL + ", YEAR9TOTAL=" + YEAR9TOTAL
						+ ", YEAR10TOTAL=" + YEAR10TOTAL + ", YEAR11TOTAL=" + YEAR11TOTAL + ", YEAR12TOTAL="
						+ YEAR12TOTAL + ", YEAR13TOTAL=" + YEAR13TOTAL + ", YEAR14TOTAL=" + YEAR14TOTAL
						+ ", YEAR15TOTAL=" + YEAR15TOTAL + ", YEAR20TOTAL=" + YEAR20TOTAL + ", YEARSITOTAL="
						+ YEARSITOTAL + ", DAY1ANNTOTAL=" + DAY1ANNTOTAL + ", DAY7ANNTOTAL=" + DAY7ANNTOTAL
						+ ", DAY15ANNTOTAL=" + DAY15ANNTOTAL + ", MONTH1ANNTOTAL=" + MONTH1ANNTOTAL
						+ ", MONTH3ANNTOTAL=" + MONTH3ANNTOTAL + ", MONTH6ANNTOTAL=" + MONTH6ANNTOTAL + "]";
			}
}
