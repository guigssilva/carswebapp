package com.projeto.modelo;

import java.io.Serializable;

	public class Contato implements Serializable  {
		
		private static final long serialVersionUID = 1L;
		private long id;
		private String nome;
		private String telefone;
		
		

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

}
