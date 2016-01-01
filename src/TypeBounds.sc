import java.io.Closeable

def using[T <: Closeable](resource : => T)(fun: => Unit) = {

}

