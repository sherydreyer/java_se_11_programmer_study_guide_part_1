package chapter8.inheritingmembers;

import java.util.List;

public class LongTailAnimal {
    protected void chew(List<String> input) {}
}
class Anteater extends LongTailAnimal {
    protected void chew(List<String> input) {}
}
