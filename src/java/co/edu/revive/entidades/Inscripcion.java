/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.revive.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mauro Parra
 */
@Entity
@Table(name = "inscripcion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inscripcion.findAll", query = "SELECT i FROM Inscripcion i")
    , @NamedQuery(name = "Inscripcion.findByCodigoinscripcion", query = "SELECT i FROM Inscripcion i WHERE i.codigoinscripcion = :codigoinscripcion")
    , @NamedQuery(name = "Inscripcion.findByNombre", query = "SELECT i FROM Inscripcion i WHERE i.nombre = :nombre")
    , @NamedQuery(name = "Inscripcion.findByApellido", query = "SELECT i FROM Inscripcion i WHERE i.apellido = :apellido")
    , @NamedQuery(name = "Inscripcion.findByTelefono", query = "SELECT i FROM Inscripcion i WHERE i.telefono = :telefono")
    , @NamedQuery(name = "Inscripcion.findByCorreo", query = "SELECT i FROM Inscripcion i WHERE i.correo = :correo")
    , @NamedQuery(name = "Inscripcion.findByCurso", query = "SELECT i FROM Inscripcion i WHERE i.curso = :curso")
    , @NamedQuery(name = "Inscripcion.findByValor", query = "SELECT i FROM Inscripcion i WHERE i.valor = :valor")
    , @NamedQuery(name = "Inscripcion.findById", query = "SELECT i FROM Inscripcion i WHERE i.id = :id")})
public class Inscripcion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 2147483647)
    @Column(name = "codigoinscripcion")
    private String codigoinscripcion;
    @Size(max = 2147483647)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 2147483647)
    @Column(name = "apellido")
    private String apellido;
    @Size(max = 2147483647)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 2147483647)
    @Column(name = "correo")
    private String correo;
    @Size(max = 2147483647)
    @Column(name = "curso")
    private String curso;
    @Size(max = 2147483647)
    @Column(name = "valor")
    private String valor;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    public Inscripcion() {
    }

    public Inscripcion(Integer id) {
        this.id = id;
    }

    public String getCodigoinscripcion() {
        return codigoinscripcion;
    }

    public void setCodigoinscripcion(String codigoinscripcion) {
        this.codigoinscripcion = codigoinscripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inscripcion)) {
            return false;
        }
        Inscripcion other = (Inscripcion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.revive.entidades.Inscripcion[ id=" + id + " ]";
    }
    
}
