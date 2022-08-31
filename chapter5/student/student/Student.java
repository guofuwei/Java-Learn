package student;
public class Student{
  private String stuid;
  private String name;
  private double math;
  private double english;
  private double computer;
  public Student()
  {
    this.stuid="";
    this.name="none";
    this.math=this.english=this.computer=0;
  }
  public Student(String stuid,String name,double math,double english,double computer)
  {
    this.stuid=stuid;
    this.name=name;
    this.math=math;
    this.english=english;
    this.computer=computer;
  }
  public void setId(String id){
    this.stuid=id;
  }
  public void setName(String name) {
    this.name=name; 
  }
  public void setMath(double score)
  {
    this.math=score;
  }
  public void setEnglish(double score)
  {
    this.english=score;
  }
  public void setComputer(double score)
  {
    this.computer=score;
  }
  public String getId()
  {
    return this.stuid;
  }
  public String getName(){
    return this.name;
  }
  public double getMath(){
    return this.math;
  }
  public double getEnglish(){
    return this.english;
  }
  public double getComputer(){
    return this.computer;
  }
  public double sum()
  {
    return this.math+this.english+this.computer;
  }
  public double avg(){
    return this.sum()/3;
  }
  public double min()
  {
    return (this.math<this.english)?(this.math<this.computer?this.math:this.computer):(this.english<this.computer?this.english:this.computer);
  }
}
