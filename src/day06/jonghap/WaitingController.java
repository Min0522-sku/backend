package day06.jonghap;

public class WaitingController {
    Waiting[] waiting = new Waiting[100];

    Boolean addWaiting(String phone, int count){
        Waiting waiting = new Waiting();
        waiting.phone = phone;
        waiting.count = count;
        for (int i = 0; i < this.waiting.length; i++) {
            if (this.waiting[i] == null) {
                this.waiting[i] = waiting;
                return true;
            }
        }
        return false;
    }
    Waiting[] getWaitingList(){
        return waiting;
        }
    }
