package com.apirest.puertoazul_api_rest.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.data.annotation.CreatedDate;

import javax.swing.plaf.basic.BasicDesktopIconUI;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "empleados")
public class Empleado implements IGenericStatusClass<Integer>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nombres;

    @Column(nullable = false)
    private String apellidos;

    @NotNull(message = "Seleccione su fecha de nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fecha_nac;

    @Size(min = 8, max = 12, message = "El campo minimo es 8")
    @Column(nullable = false, unique = true, length = 12)
    private String num_doc;


    @NotNull(message = "Seleccione su genero")
    private String genero;

    private String estado_civil;

    @Size(min = 9, max = 9, message = "El campo minimo es 9")
    @Column(nullable = false, unique = false, length = 9)
    private String celular;


    @NotEmpty(message = "El campo esta vacio")
    @Email(message = "El email no tiene un formato correcto.")
    @Size(min = 0, message = "El campo minimo es 0")
    @Column(nullable = false, unique = true)
    private String email;



    @CreatedDate
    private Date fecha_registro;

    private String foto;

    private String desc_empleado;

    @NotEmpty(message = "Ingresé dirección")
    private String direccion;

    @NotNull(message = "Usted debe seleccionar un cargo")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cargo")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Cargo cargo;

    @NotNull(message = "Usted debe seleccionar un tipo de documento")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_documento")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Tipo_Documento tipo_documento;

    @NotNull(message = "Usted debe seleccionar un distrito")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_distrito")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Distrito distrito;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Estado estado;


    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "empleado")
    @PrimaryKeyJoinColumn
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "empleado", "password"})
    private Usuario_Empleado usuario_empleado;

    @PrePersist
    private void prePresist(){
        this.fecha_registro = new Date();
    }

    public Usuario_Empleado getUsuario_empleado() {
        return usuario_empleado;
    }

    public void setUsuario_empleado(Usuario_Empleado usuario_empleado) {
        this.usuario_empleado = usuario_empleado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getNum_doc() {
        return num_doc;
    }

    public void setNum_doc(String num_doc) {
        this.num_doc = num_doc;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDesc_empleado() {
        return desc_empleado;
    }

    public void setDesc_empleado(String desc_empleado) {
        this.desc_empleado = desc_empleado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Tipo_Documento getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(Tipo_Documento tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    @Override
    public Estado getEstado() {
        return estado;
    }

    @Override
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fecha_nac=" + fecha_nac +
                ", num_doc='" + num_doc + '\'' +
                ", genero='" + genero + '\'' +
                ", estado_civil='" + estado_civil + '\'' +
                ", celular='" + celular + '\'' +
                ", email='" + email + '\'' +
                ", fecha_registro=" + fecha_registro +
                ", foto='" + foto + '\'' +
                ", desc_empleado='" + desc_empleado + '\'' +
                ", direccion='" + direccion + '\'' +
                ", cargo=" + cargo +
                ", tipo_documento=" + tipo_documento +
                ", distrito=" + distrito +
                ", estado=" + estado +
                ", usuario_empleado=" + usuario_empleado +
                '}';
    }
}
