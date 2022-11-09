public class Laptop {
 Zhd zhd ;
 Op op ;
 Os os ;
 Prosesor prosesor;

 public Laptop(Zhd zhd, Op op, Os os, Prosesor prosesor) {
  this.zhd = zhd;
  this.op = op;
  this.os = os;
  this.prosesor = prosesor;
 }

 public void setZhd(Zhd zhd) {
  this.zhd = zhd;
 }

 public void setOp(Op op) {
  this.op = op;
 }

 public void setOs(Os os) {
  this.os = os;
 }

 public void setProsesor(Prosesor prosesor) {
  this.prosesor = prosesor;
 }

 @Override
 public String toString() {
  return "Noutbook{" +
          "vidioKarta=" + zhd +
          ", opirativnaia pamiat =" + op +
          ", operativnaia sistema =" + os +
          ", prosesor=" + prosesor +
          '}';
 }
}
