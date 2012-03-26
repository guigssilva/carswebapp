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
@SequenceGenerator(name = "mega_sena_serial", sequenceName = "mega_sena_serial")
@Table(name="mega_sena")
public class MegaSena implements Serializable  {
		
		private static final long serialVersionUID = 1L;
		@Id @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mega_sena_serial")
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
		
		

		public MegaSena() {
			super();
		}
		
		public MegaSena(String nome, String telefone, long id) {
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
