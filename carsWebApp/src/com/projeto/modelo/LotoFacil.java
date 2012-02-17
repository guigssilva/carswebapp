package com.projeto.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "loto_facil_serial", sequenceName = "loto_facil_serial")
@Table(name="loto_facil")
public class LotoFacil implements Serializable  {
		
		private static final long serialVersionUID = 1L;
		@Id @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="loto_facil_serial")
		private long id;
		@Column(name="nr_resultado_1")
		private Long nrResultado1;
		@Column(name="nr_resultado_2")
		private Long nrResultado2;
		@Column(name="nr_resultado_3")
		private Long nrResultado3;
		@Column(name="nr_resultado_4")
		private Long nrResultado4;
		@Column(name="nr_resultado_5")
		private Long nrResultado5;
		@Column(name="nr_resultado_6")
		private Long nrResultado6;
		@Column(name="nr_resultado_7")
		private Long nrResultado7;
		@Column(name="nr_resultado_8")
		private Long nrResultado8;
		@Column(name="nr_resultado_9")
		private Long nrResultado9;
		@Column(name="nr_resultado_10")
		private Long nrResultado10;
		@Column(name="nr_resultado_11")
		private Long nrResultado11;
		@Column(name="nr_resultado_12")
		private Long nrResultado12;
		@Column(name="nr_resultado_13")
		private Long nrResultado13;
		@Column(name="nr_resultado_14")
		private Long nrResultado14;
		@Column(name="nr_resultado_15")
		private Long nrResultado15;
		@Column(name="dt_resultado")
		private Date dtResultado;
		@Column(name="dt_geracao")
		private Date dtGeracao;
		@Column(name="nr_concurso")
		private Long nrConcurso;
		@Column(name="nr_gerado_conc")
		private Long nrGeradoConc;
		@Column(name="nr_gerado_premiado")
		private Long nrGeradoPremiado;
		@Column(name="mensagem")
		private String mensagem;
		
		

		public LotoFacil() {
			super();
		}
		
		public LotoFacil(String nome, String telefone, long id) {
			super();
			this.id = id;
		}
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}

		/**
		 * @return the nrResultado1
		 */
		public Long getNrResultado1() {
			return nrResultado1;
		}

		/**
		 * @param nrResultado1 the nrResultado1 to set
		 */
		public void setNrResultado1(Long nrResultado1) {
			this.nrResultado1 = nrResultado1;
		}

		/**
		 * @return the nrResultado2
		 */
		public Long getNrResultado2() {
			return nrResultado2;
		}

		/**
		 * @param nrResultado2 the nrResultado2 to set
		 */
		public void setNrResultado2(Long nrResultado2) {
			this.nrResultado2 = nrResultado2;
		}

		/**
		 * @return the nrResultado3
		 */
		public Long getNrResultado3() {
			return nrResultado3;
		}

		/**
		 * @param nrResultado3 the nrResultado3 to set
		 */
		public void setNrResultado3(Long nrResultado3) {
			this.nrResultado3 = nrResultado3;
		}

		/**
		 * @return the nrResultado4
		 */
		public Long getNrResultado4() {
			return nrResultado4;
		}

		/**
		 * @param nrResultado4 the nrResultado4 to set
		 */
		public void setNrResultado4(Long nrResultado4) {
			this.nrResultado4 = nrResultado4;
		}

		/**
		 * @return the nrResultado5
		 */
		public Long getNrResultado5() {
			return nrResultado5;
		}

		/**
		 * @param nrResultado5 the nrResultado5 to set
		 */
		public void setNrResultado5(Long nrResultado5) {
			this.nrResultado5 = nrResultado5;
		}

		/**
		 * @return the nrResultado6
		 */
		public Long getNrResultado6() {
			return nrResultado6;
		}

		/**
		 * @param nrResultado6 the nrResultado6 to set
		 */
		public void setNrResultado6(Long nrResultado6) {
			this.nrResultado6 = nrResultado6;
		}

		/**
		 * @return the nrResultado7
		 */
		public Long getNrResultado7() {
			return nrResultado7;
		}

		/**
		 * @param nrResultado7 the nrResultado7 to set
		 */
		public void setNrResultado7(Long nrResultado7) {
			this.nrResultado7 = nrResultado7;
		}

		/**
		 * @return the nrResultado8
		 */
		public Long getNrResultado8() {
			return nrResultado8;
		}

		/**
		 * @param nrResultado8 the nrResultado8 to set
		 */
		public void setNrResultado8(Long nrResultado8) {
			this.nrResultado8 = nrResultado8;
		}

		/**
		 * @return the nrResultado9
		 */
		public Long getNrResultado9() {
			return nrResultado9;
		}

		/**
		 * @param nrResultado9 the nrResultado9 to set
		 */
		public void setNrResultado9(Long nrResultado9) {
			this.nrResultado9 = nrResultado9;
		}

		/**
		 * @return the nrResultado10
		 */
		public Long getNrResultado10() {
			return nrResultado10;
		}

		/**
		 * @param nrResultado10 the nrResultado10 to set
		 */
		public void setNrResultado10(Long nrResultado10) {
			this.nrResultado10 = nrResultado10;
		}

		/**
		 * @return the nrResultado11
		 */
		public Long getNrResultado11() {
			return nrResultado11;
		}

		/**
		 * @param nrResultado11 the nrResultado11 to set
		 */
		public void setNrResultado11(Long nrResultado11) {
			this.nrResultado11 = nrResultado11;
		}

		/**
		 * @return the nrResultado12
		 */
		public Long getNrResultado12() {
			return nrResultado12;
		}

		/**
		 * @param nrResultado12 the nrResultado12 to set
		 */
		public void setNrResultado12(Long nrResultado12) {
			this.nrResultado12 = nrResultado12;
		}

		/**
		 * @return the nrResultado13
		 */
		public Long getNrResultado13() {
			return nrResultado13;
		}

		/**
		 * @param nrResultado13 the nrResultado13 to set
		 */
		public void setNrResultado13(Long nrResultado13) {
			this.nrResultado13 = nrResultado13;
		}

		/**
		 * @return the nrResultado14
		 */
		public Long getNrResultado14() {
			return nrResultado14;
		}

		/**
		 * @param nrResultado14 the nrResultado14 to set
		 */
		public void setNrResultado14(Long nrResultado14) {
			this.nrResultado14 = nrResultado14;
		}

		/**
		 * @return the nrResultado15
		 */
		public Long getNrResultado15() {
			return nrResultado15;
		}

		/**
		 * @param nrResultado15 the nrResultado15 to set
		 */
		public void setNrResultado15(Long nrResultado15) {
			this.nrResultado15 = nrResultado15;
		}

		/**
		 * @return the dtResultado
		 */
		public Date getDtResultado() {
			return dtResultado;
		}

		/**
		 * @param dtResultado the dtResultado to set
		 */
		public void setDtResultado(Date dtResultado) {
			this.dtResultado = dtResultado;
		}

		/**
		 * @return the dtGeracao
		 */
		public Date getDtGeracao() {
			return dtGeracao;
		}

		/**
		 * @param dtGeracao the dtGeracao to set
		 */
		public void setDtGeracao(Date dtGeracao) {
			this.dtGeracao = dtGeracao;
		}

		/**
		 * @return the nrConcurso
		 */
		public Long getNrConcurso() {
			return nrConcurso;
		}

		/**
		 * @param nrConcurso the nrConcurso to set
		 */
		public void setNrConcurso(Long nrConcurso) {
			this.nrConcurso = nrConcurso;
		}

		/**
		 * @return the nrGeradoConc
		 */
		public Long getNrGeradoConc() {
			return nrGeradoConc;
		}

		/**
		 * @param nrGeradoConc the nrGeradoConc to set
		 */
		public void setNrGeradoConc(Long nrGeradoConc) {
			this.nrGeradoConc = nrGeradoConc;
		}

		/**
		 * @return the nrGeradoPremiado
		 */
		public Long getNrGeradoPremiado() {
			return nrGeradoPremiado;
		}

		/**
		 * @param nrGeradoPremiado the nrGeradoPremiado to set
		 */
		public void setNrGeradoPremiado(Long nrGeradoPremiado) {
			this.nrGeradoPremiado = nrGeradoPremiado;
		}

		/**
		 * @return the mensagem
		 */
		public String getMensagem() {
			return mensagem;
		}

		/**
		 * @param mensagem the mensagem to set
		 */
		public void setMensagem(String mensagem) {
			this.mensagem = mensagem;
		}
}
