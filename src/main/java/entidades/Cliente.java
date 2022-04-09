package entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cadastro_Cliente")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Código_Cliente")
	private Integer id;
	
	@Column(name =  "Nome_Cliente", nullable = false)
	private String nome;
	
	@Column(name = "Email", nullable = false)
	private String email;
	
	@Column(name = "Cidade", nullable = false)
	private String cidade;
	
	@Column(name = "Data_Nascimento", nullable = false)
	private String nascimento;
	
	@Column(name = "Data_Cadastro", nullable = false)
	private String dataCadastro;	
	
}
