package source.produk;import javax.swing.JComboBox;public class Produk{	private int idProduk;	private String namaProduk;		private int idJenis;	private String jenisProduk;		private JComboBox cbJenis;		private int stok;	private int harga;		private int idSuplier;	private String namaSuplier;	private JComboBox cbSuplier;		public void setIdProduk(int id){		this.idProduk = id;	}		public int getIdProduk(){		return this.idProduk;	}		public void setNamaProduk(String nama){		this.namaProduk = nama;	}		public String getNamaProduk(){		return this.namaProduk;	}		//jenis	public void setIdJenis(int idJenis){		this.idJenis = idJenis;	}		public int getIdJenis(){		return this.idJenis;	}		public void setJenis(String jenis){		this.jenisProduk = jenis;	}		public String getJenis(){		return this.jenisProduk;	}		public void setComboJenis(JComboBox cbJenis){		this.cbJenis = cbJenis;	}		public JComboBox getComboJenis(){		return cbJenis;	}	//akhir jenis		public void setStok(int stok){		this.stok = stok;	}		public int getStok(){		return this.stok;	}		public void setHarga(int harga){		this.harga = harga;	}		public int getHarga(){		return this.harga;	}		//untuk suplier	public void setIdSuplier(int idSuplier){		this.idSuplier = idSuplier;	}		public int getIdSuplier(){		return this.idSuplier;	}		public void setNamaSuplier(String namaSuplier){		this.namaSuplier = namaSuplier;	}		public String getNamaSuplier(){		return this.namaSuplier;	}		public void setComboSuplier(JComboBox cbSuplier){		this.cbSuplier = cbSuplier;	}		public JComboBox getComboSuplier(){		return cbSuplier;	}	//akhir suplier		public String toString(){        return this.namaProduk;    }}