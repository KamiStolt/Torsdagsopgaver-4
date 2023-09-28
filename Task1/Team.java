class Team {
	
	private String teamName;
	private int teamRank;
	private String playerName;

	public Team(String teamName){

		this.teamName=teamName;
		this.playerName=playerName;
	}
	public void setRank(int teamRank) {
		this.teamRank=teamRank;
	}
	public String toString(){
		return " Hold: " + teamName + " Rang: " + teamRank;
	}

}