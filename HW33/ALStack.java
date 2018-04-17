//Shafali Gupta
//APCS2 pd 01
//HW32 - Leon Leonwood Stack
//2018-04-12

import java.util.ArrayList;

public class ALStack<PANCAKE> implements Stack<PANCAKE>{
  public int _stackSize;
  public ArrayList<PANCAKE> _stack;

  public ALStack(){
    _stackSize = 0;
    _stack = new ArrayList<PANCAKE>();
  }

  public ALStack(int _stackSize){
    _stackSize = 0;
    _stack = new ArrayList<PANCAKE>(_stackSize);
  }

  public boolean isEmpty(){
    return _stackSize == 0;
  }
  public PANCAKE peek(){
    if (isEmpty()){
      return null;
    }
    return _stack.get(_stackSize-1);
  }
  public PANCAKE pop(){
    if (!(isEmpty())){
    _stackSize --;
    return _stack.remove(_stackSize);}
    else{
      return null;
    }

  }
  public void push(PANCAKE x){
    _stackSize ++;
    _stack.add(x);
  }
  public String toString(){
    String retStr="[";
    for (int i =0; i<_stackSize; i++){
      retStr+= _stack.get(i) + ",";
    }
    return retStr + "]";
  }
}
