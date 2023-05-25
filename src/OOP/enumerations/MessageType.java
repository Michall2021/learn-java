package enumerations;

public enum MessageType {
	A(Priority.HIGH), B(Priority.MEDIUM), C(Priority.LOW), D(Priority.USELESS);

	private Priority priority;

	private MessageType(Priority priority) {
		this.priority = priority;
	}

	public Priority getPriority() {
		return this.priority;
	}
}