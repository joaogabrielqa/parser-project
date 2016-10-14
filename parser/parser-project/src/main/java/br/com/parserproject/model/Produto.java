package br.com.parserproject.model;

/**
 * Classe de representação do registro 0200 do SPED Fiscal. Para mais informações ver o guia prático do SPED em
 * <code><a> https://www.fazenda.sp.gov.br/sped/downloads/GUIA_PRATICO_DA_EFD-Versao_2.0.19.pdf </a></code>
 * @author João Gabriel QA
 *
 */
public class Produto extends AbstractEntity{
	
	/**
	 * Código do produto: COD_ITEM
	 */
	private Long idProduto;
	/**
	 * Descrição do produto: DESCR_ITEM
	 */
	private String descricao;
	/**
	 * Codigo de barras do produto: COD_BARRA
	 */
	private String codigoGtin;
	/**
	 * Código anterior do item: COD_ANT_ITEM
	 */
	private String codigoAnterior;
	/**
	 * Unidade de medida da quantificação do estoque: UNID_INV
	 */
	private String unidadeInventario;
	/**
	 * Tipo do item (produto): TIPO_ITEM
	 */
	private String tipoItem;
	/**
	 * Codigo NCM: COD_NCM
	 */
	private String codigoNcm;
	/**
	 * Codigo EX, conforme a TIPI: EX_IPI
	 */
	private String exIpi;
	/**
	 * Codigo de gênero do item: COD_GEN 
	 */
	private String codigoGenero;
	/**
	 * Código do serviço: COD_LST
	 */
	private String codigoLst;
	/**
	 * Alíquota ICMS do ítem: ALIQ_ICMS
	 */
	private String aliquotaIcms;
	/**
	 * Código especificador da situação tributária: CEST
	 */
	private String cest;
	
	

	@Override
	public String getGeneratedKey() {
		// TODO Auto-generated method stub
		return null;
	}



	public Long getIdProduto() {
		return idProduto;
	}



	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public String getCodigoGtin() {
		return codigoGtin;
	}



	public void setCodigoGtin(String codigoGtin) {
		this.codigoGtin = codigoGtin;
	}



	public String getCodigoAnterior() {
		return codigoAnterior;
	}



	public void setCodigoAnterior(String codigoAnterior) {
		this.codigoAnterior = codigoAnterior;
	}



	public String getUnidadeInventario() {
		return unidadeInventario;
	}



	public void setUnidadeInventario(String unidadeInventario) {
		this.unidadeInventario = unidadeInventario;
	}



	public String getTipoItem() {
		return tipoItem;
	}



	public void setTipoItem(String tipoItem) {
		this.tipoItem = tipoItem;
	}



	public String getCodigoNcm() {
		return codigoNcm;
	}



	public void setCodigoNcm(String codigoNcm) {
		this.codigoNcm = codigoNcm;
	}



	public String getExIpi() {
		return exIpi;
	}



	public void setExIpi(String exIpi) {
		this.exIpi = exIpi;
	}



	public String getCodigoGenero() {
		return codigoGenero;
	}



	public void setCodigoGenero(String codigoGenero) {
		this.codigoGenero = codigoGenero;
	}



	public String getCodigoLst() {
		return codigoLst;
	}



	public void setCodigoLst(String codigoLst) {
		this.codigoLst = codigoLst;
	}



	public String getAliquotaIcms() {
		return aliquotaIcms;
	}



	public void setAliquotaIcms(String aliquotaIcms) {
		this.aliquotaIcms = aliquotaIcms;
	}



	public String getCest() {
		return cest;
	}



	public void setCest(String cest) {
		this.cest = cest;
	}

}
