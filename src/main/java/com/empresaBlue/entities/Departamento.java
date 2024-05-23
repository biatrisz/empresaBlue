package com.empresaBlue.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "Departamento")
public class Departamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column (name = "cidade", nullable = false, length = 100)
	private String cidade;
	
	@Column (name = "email", nullable = false, length = 100)
	private String email;
	
	@Column(name = "nome" , nullable = false, precision = 10, scale = 2)
	private String nome;
	
	@Column (name = "qtpessoas", nullable = false, length = 100)
	private String qtpessoas;
	
	@Column (name = "telefone", nullable = false, length = 100)
	private String telefone;

}
