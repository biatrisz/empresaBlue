package com.empresaBlue.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "funcionário")
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id" , nullable = false)
	private Integer id;
	
	@Column (name = "cpf", nullable = false, length = 100)
	private String cpf;
	
	@Column (name = "nome", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "salario" , nullable = false, precision = 10, scale = 2)
	private BigDecimal salario;
	
	@Column (name = "telefone", nullable = false, length = 100)
	private String telefone;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_departamento", nullable = false)
	private Departamento departamento;

}
