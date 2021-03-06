package org.openXpertya.JasperReport.DataSource;



/**
 * POJO.
 */
public class LineaPedido implements Comparable<LineaPedido>{

	private String documento;
	private String numeroDoc;
	private String concepto;
	private String lineTotalAmt;
	private String isoCode;
	private String precioMaximoCompra;
	private String precioInformado;
	private String razonSocial;
	private String dateInvoicedFormated;
	private String tipoCambio;
	private String nombreProyecto;
	private String monedaProyecto;
	private String codigoProyecto;
	
	public static final LineaPedido NULL = new LineaPedido("-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-");

	public LineaPedido(String documento, String numerodoc, String concepto,
			String lineTotalAmt, String iso_code,
			String preciomaximocompra, String precioinformado,
			String razonsocial, String dateInvoicedFormated,
			String tipocambio, String nombreProyecto, String monedaProyecto, String codigoProyecto) {
		super();
		
		this.documento = documento;
		this.numeroDoc = numerodoc;
		this.concepto = concepto;
		this.lineTotalAmt = lineTotalAmt;
		this.isoCode = iso_code;
		this.precioMaximoCompra = preciomaximocompra;
		this.precioInformado = precioinformado;
		this.razonSocial = razonsocial;
		this.dateInvoicedFormated = dateInvoicedFormated;
		this.tipoCambio = tipocambio;
		this.nombreProyecto = nombreProyecto;
		this.monedaProyecto = monedaProyecto;
		this.codigoProyecto = codigoProyecto;
	}

	/**
	 * @return the documento
	 */
	public String getDocumento() {
		return documento;
	}

	/**
	 * @return the numeroDoc
	 */
	public String getNumeroDoc() {
		return numeroDoc;
	}

	/**
	 * @return the concepto
	 */
	public String getConcepto() {
		return concepto;
	}

	/**
	 * @return the lineTotalAmt
	 */
	public String getLineTotalAmt() {
		return lineTotalAmt;
	}

	/**
	 * @return the isoCode
	 */
	public String getIsoCode() {
		return isoCode;
	}

	/**
	 * @return the precioMaximoCompra
	 */
	public String getPrecioMaximoCompra() {
		return precioMaximoCompra;
	}

	/**
	 * @return the precioInformado
	 */
	public String getPrecioInformado() {
		return precioInformado;
	}

	/**
	 * @return the razonSocial
	 */
	public String getRazonSocial() {
		return razonSocial;
	}

	/**
	 * @return the dateInvoicedFormated
	 */
	public String getDateInvoicedFormated() {
		return dateInvoicedFormated;
	}

	/**
	 * @return the tipoCambio
	 */
	public String getTipoCambio() {
		return tipoCambio;
	}
	
	public String getNombreProyecto() {
		return nombreProyecto;
	}

	/**
	 * @return the monedaProyecto
	 */
	public String getMonedaProyecto() {
		return monedaProyecto;
	}

	/**
	 * @return the codigoProyecto
	 */
	public String getCodigoProyecto() {
		return codigoProyecto;
	}

	@Override
	public int compareTo(LineaPedido o) {
		return numeroDoc.compareTo(o.numeroDoc);
	}

	
}
