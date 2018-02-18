
public class PdfVersion implements Application {

	private PdfForm pdfForm;

	@Override
	public Form operation() {
		return new PdfForm(this);
	}

	
	
}
