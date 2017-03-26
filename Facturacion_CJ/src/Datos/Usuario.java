package Datos;

/**
 *
 * @author Diego Velez
 */
public class Usuario {
    private int IDPRODUCTO;
    private String NOMBRE_PRODUCTO;
    private String TALLA;
    private String PRECIO_VENTA;
    private String DESCRIPCION;

    public Usuario() {
    }

    public int getIDPRODUCTO() {
        return IDPRODUCTO;
    }

    public void setIDPRODUCTO(int IDPRODUCTO) {
        this.IDPRODUCTO = IDPRODUCTO;
    }

    public String getNOMBRE_PRODUCTO() {
        return NOMBRE_PRODUCTO;
    }

    public void setNOMBRE_PRODUCTO(String NOMBRE_PRODUCTO) {
        this.NOMBRE_PRODUCTO = NOMBRE_PRODUCTO;
    }

    public String getTALLA() {
        return TALLA;
    }

    public void setTALLA(String TALLA) {
        this.TALLA = TALLA;
    }

    public String getPRECIO_VENTA() {
        return PRECIO_VENTA;
    }

    public void setPRECIO_VENTA(String PRECIO_VENTA) {
        this.PRECIO_VENTA = PRECIO_VENTA;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }
    
    
}
