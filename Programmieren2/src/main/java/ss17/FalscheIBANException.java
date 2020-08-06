package ss17;

public class FalscheIBANException extends Exception {

	public FalscheIBANException() {
		super("Fehler: Datei enthält ungültige IBAN");
	}
	
	public FalscheIBANException(String msg) {
		super(msg);
	}
	
}
