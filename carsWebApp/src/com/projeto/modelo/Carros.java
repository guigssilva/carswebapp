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
@SequenceGenerator(name = "carros_seq", sequenceName = "carros_seq")
@Table(name="carros")
public class Carros implements Serializable  {
		
		private static final long serialVersionUID = 1L;
		@Id @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="carros_seq")
		private long id;
		@Column(name="nome")
		private String nome;
		@Column(name="descricao")
		private String descricao;
		@Column(name="estoque")
		private Long estoque;
		@Column(name="garantia")
		private Long garantia;
		@Column(name="valor")
		private Double valor;
		@Column(name="imagem")
		private String imagem;
		@Column(name="desconto")
		private Double desconto;
		
		

		public Carros() {
			super();
		}
		
		public Carros(String nome, String descricao, long id) {
			super();
			this.id = id;
			this.nome = nome;
			this.descricao = descricao;
		}

		/**
		 * @return the id
		 */
		public long getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(long id) {
			this.id = id;
		}

		/**
		 * @return the nome
		 */
		public String getNome() {
			return nome;
		}

		/**
		 * @param nome the nome to set
		 */
		public void setNome(String nome) {
			this.nome = nome;
		}

		/**
		 * @return the descricao
		 */
		public String getDescricao() {
			return descricao;
		}

		/**
		 * @param descricao the descricao to set
		 */
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		/**
		 * @return the estoque
		 */
		public Long getEstoque() {
			return estoque;
		}

		/**
		 * @param estoque the estoque to set
		 */
		public void setEstoque(Long estoque) {
			this.estoque = estoque;
		}

		/**
		 * @return the garantia
		 */
		public Long getGarantia() {
			return garantia;
		}

		/**
		 * @param garantia the garantia to set
		 */
		public void setGarantia(Long garantia) {
			this.garantia = garantia;
		}

		/**
		 * @return the valor
		 */
		public Double getValor() {
			return valor;
		}

		/**
		 * @param valor the valor to set
		 */
		public void setValor(Double valor) {
			this.valor = valor;
		}

		/**
		 * @return the imagem
		 */
		public String getImagem() {
			return imagem;
		}

		/**
		 * @param imagem the imagem to set
		 */
		public void setImagem(String imagem) {
			this.imagem = imagem;
		}

		/**
		 * @return the desconto
		 */
		public Double getDesconto() {
			return desconto;
		}

		/**
		 * @param desconto the desconto to set
		 */
		public void setDesconto(Double desconto) {
			this.desconto = desconto;
		}
		
		
		
}
