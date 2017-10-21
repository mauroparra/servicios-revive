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
@Table(name = "instructores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Instructores.findAll", query = "SELECT i FROM Instructores i")
    , @NamedQuery(name = "Instructores.findByCedula", query = "SELECT i FROM Instructores i WHERE i.cedula = :cedula")
    , @NamedQuery(name = "Instructores.findByNombre", query = "SELECT i FROM Instructores i WHERE i.nombre = :nombre")
    , @NamedQuery(name = "Instructores.findByApellido", query = "SELECT i FROM Instructores i WHERE i.apellido = :apellido")
    , @NamedQuery(name = "Instructores.findByTelefono", query = "SELECT i FROM Instructores i WHERE i.telefono = :telefono")
    , @NamedQuery(name = "Instructores.findByCorreo", query = "SELECT i FROM Instructores i WHERE i.correo = :correo")
    , @NamedQuery(name = "Instructores.findByProfesion", query = "SELECT i FROM Instructores i WHERE i.profesion = :profesion")
    , @NamedQuery(name = "Instructores.findByCurso", query = "SELECT i FROM Instructores i WHERE i.curso = :curso")
    , @NamedQuery(name = "Instructores.findById", query = "SELECT i FROM Instructores i WHERE i.id = :id")})
public class Instructores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 2147483647)
    @Column(name = "cedula")
    private String cedula;
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
    @Column(name = "profesion")
    private String profesion;
    @Size(max = 2147483647)
    @Column(name = "curso")
    private String curso;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    public Instructores() {
    }

    public Instructores(Integer id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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
        if (!(object instanceof Instructores)) {
            return false;
        }
        Instructores other = (Instructores) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.revive.entidades.Instructores[ id=" + id + " ]";
    }
    
}
