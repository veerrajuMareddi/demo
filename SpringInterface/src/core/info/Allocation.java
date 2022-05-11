package core.info;

public class Allocation 
{
private int  id;
private Hr both;

public void setBoth(Hr both) {
	this.both = both;
}
public void setId(int id) {
	this.id = id;
}
public void every()
{
	both.hi();
	both.lb();
}


}
