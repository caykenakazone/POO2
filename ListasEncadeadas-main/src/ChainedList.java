import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedList <T extends String>{
    private LinkedList<T> ll;

    //Construtor
    public ChainedList(int node) {
        ll = new LinkedList<>();
    }

    //Métodos
    private void add(T t){
        ll.add(t);
    }

    private String remove(int index){
        return ll.remove(index);
    }

    private void Print(){
        for(int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }
    }

    private void apontarReferenciaNext(){
        //Este método retorna o próximo elemento referenciado pelo ponteiro de memória começando pelo primeiro. Essas informações são salvas no Iterador

        Iterator<T> it = ll.iterator();
        if(it.hasNext()){
            System.out.println(it.next());
        }else{
            System.out.println("Não há um próximo elemento");
        }
    }

    private void apontarReferenciaPrevious(){
        //Este método retorna o elemento anterior referenciado pelo ponteiro de memória começando pelo primeiro. Essas informações são salvas no Iterador
        ListIterator<T> it = ll.listIterator();
        if(it.hasPrevious()){
            System.out.println(it.previous());
        }else{
            System.out.println("Não há um elemento anterior");
        }
    }
}
