//package Day6Training.SealedClassesDemo;
//
//
//sealed public class Reader permits Scanner , PdfReader,EXCELReader {}
//sealed public class Scanner extends Reader{}
//
////non-sealed class Scanner extends Reader{}
//
//final class PdfReader extends Reader {}
//sealed class EXCELReader extends Reader permits XLSReader,XLSXReader{}
//final class XLSReader extends EXCELReader{}
//final class XLSXReader extends EXCELReader{}
//
//class Z {}
//sealed abstract class A permits B,C {
//    public abstract void a();}
//non-sealed class B extends A{
//    @Override
//    public void a() {}
//}
//
//non-sealed class C extends A{
//
//
//    @Override
//    public void a() {
//
//    }
//}
//
//final class Temp implements I1{}
//
//
//sealed interface I1 permits I2, I3, Temp {}
//
//non-sealed interface I2 extends I1{}
//
//sealed interface I3 extends I1 permits I4{}
//
//non-sealed interface I4 extends I3{}
//
//
//
//
//
