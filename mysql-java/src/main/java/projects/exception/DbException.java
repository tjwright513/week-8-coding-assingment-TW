package projects.exception;
import java.security.cert.CertificateException;


@SuppressWarnings("serial")
public class DbException extends CertificateException {

	public DbException(String message) {
		super(message);
	}
	public DbException(Throwable cause) {
		super(cause);
	}
	public DbException(String message, Throwable cause) {
		super(message, cause);
	}
}
