package hamthoi;

// Tạo class để hứng data từ query
public class LoanApplicationDTO {
	// các thuộc tính của class
	int saleId;
	String loanId;
	String status;
	
	// các hàm get, set của các thuộc tính
	public int getSaleId() {
		System.out.println("thư gọi getter : " + saleId);
		return saleId;
	}
	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}
	public String getLoanId() {
		return loanId;
	}
	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	// hàm khởi tạo đầy đủ thuộc tính
	public LoanApplicationDTO(int saleId, String loanId, String status) {
		super();
		this.saleId = saleId;
		this.loanId = loanId;
		this.status = status;
	}
	// hàm khởi tạo không có thuộc tính
	public LoanApplicationDTO() {
		super();
	}
	// hàm tostring
	@Override
	public String toString() {
		return "LoanApplicationDTO [saleId=" + saleId + ", loanId=" + loanId + ", status=" + status + "]" + "\n";
	}

	
	
}
