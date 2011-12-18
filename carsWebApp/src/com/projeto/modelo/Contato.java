package com.projeto.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "contato_serial", sequenceName = "contato_serial")
@Table(name="contatos")
public class Contato implements Serializable  {
		
		private static final long serialVersionUID = 1L;
		@Id @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="contato_serial")
		private long id;
		@Column(name="nome")
		private String nome;
		@Column(name="telefone")
		private String telefone;
		@Column(name="email")
		private String email;
		@Column(name="empresa")
		private String empresa;
		@Column(name="mensagem")
		private String mensagem;
		
		

		public Contato() {
			super();
		}
		
		public Contato(String nome, String telefone, long id) {
			super();
			this.id = id;
			this.nome = nome;
			this.telefone = telefone;
		}
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

		/**
		 * @return the email
		 */
		public String getEmail() {
			return email;
		}

		/**
		 * @param email the email to set
		 */
		public void setEmail(String email) {
			this.email = email;
		}

		/**
		 * @return the empresa
		 */
		public String getEmpresa() {
			return empresa;
		}

		/**
		 * @param empresa the empresa to set
		 */
		public void setEmpresa(String empresa) {
			this.empresa = empresa;
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
