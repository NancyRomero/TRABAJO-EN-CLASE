/*
 * UNIANDES-PUYO
 * SISTEMAS FACTURACION 2016
 * 23/05/2016
 */
package Entidades;

/**
 * ALBERTO CASCO
 * OCTAVO SEMESTRE
 */
public class clsProducto {
    private int _id;
    private String _nombre;
    private String _descripcion;
    private int _stock;
    private float _pvp;//PRECIO DE VENTA AL PUBLICO
    private float _pcp;//PRECIO DE COMPRA AL PUBLICO
    private boolean _sinIva;

    public clsProducto() {
    }

    public clsProducto(int _id, String _nombre, String _descripcion, int _stock, float _pvp, float _pcp, boolean _sinIva) {
        this._id = _id;
        this._nombre = _nombre;
        this._descripcion = _descripcion;
        this._stock = _stock;
        this._pvp = _pvp;
        this._pcp = _pcp;
        this._sinIva = _sinIva;
    }

    public String Descripcion() {
        return _descripcion;
    }

    public void Descripcion(String _descripcion) {
        this._descripcion = _descripcion;
    }

    public int Id() {
        return _id;
    }

    public void Id(int _id) {
        this._id = _id;
    }

    public String Nombre() {
        return _nombre;
    }

    public void Nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public float Pcp() {
        return _pcp;
    }

    public void Pcp(float _pcp) {
        this._pcp = _pcp;
    }

    public float Pvp() {
        return _pvp;
    }

    public void Pvp(float _pvp) {
        this._pvp = _pvp;
    }

    public int Stock() {
        return _stock;
    }

    public void Stock(int _stock) {
        this._stock = _stock;
    }

    public boolean SinIva() {
        return _sinIva;
    }

    public void SinIva(boolean _sinIva) {
        this._sinIva = _sinIva;
    }
    
    
}
