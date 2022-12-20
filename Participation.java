package model;

public class Participation {

	private int hours;
	private final Research researcher;
	private final Project project;

	public Participation(int hours, Research researcher, Project project) {
		this.hours = hours;
		this.researcher = researcher;
		this.project = project;
	}

	public int getHours() {
		return this.hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public Research getResearcher() {
		return this.researcher;
	}

	public Project getProject() {
		return this.project;
	}

	@Override
	public String toString() {
		return "Participation{" +
				"Hours=" + hours +
				", researcher=" + researcher +
				", project=" + project +
				'}';
	}
}