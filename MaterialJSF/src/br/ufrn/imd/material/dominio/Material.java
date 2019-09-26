package br.ufrn.imd.material.dominio;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Material {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_MATERIAL")
	@SequenceGenerator(name="SEQ_MATERIAL", sequenceName="id_seq_material", allocationSize=1)
	
	private int id;
	private String codigo;
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuarioCadastro;
	
	@Temporal(TemporalType.DATE)
	private Date dataCadastro;
	
	@Transient
	private ClassificacaoMaterial classificacaoMaterial;
	
	@Transient
	private GrupoMaterial grupoMaterial;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Usuario getUsuarioCadastro() {
		return usuarioCadastro;
	}
	public void setUsuarioCadastro(Usuario usuarioCadastro) {
		this.usuarioCadastro = usuarioCadastro;
	}
	
	public ClassificacaoMaterial getClassificacaoMaterial() {
		return classificacaoMaterial;
	}
	public void setClassificacaoMaterial(ClassificacaoMaterial classificacaoMaterial) {
		this.classificacaoMaterial = classificacaoMaterial;
	}
	public GrupoMaterial getGrupoMaterial() {
		return grupoMaterial;
	}
	public void setGrupoMaterial(GrupoMaterial grupoMaterial) {
		this.grupoMaterial = grupoMaterial;
	}
	
}
