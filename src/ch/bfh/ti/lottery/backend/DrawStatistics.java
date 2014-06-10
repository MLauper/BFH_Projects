package ch.bfh.ti.lottery.backend;

import ch.bfh.ti.lottery.tickets.TicketType.Plays.Play;
import ch.bfh.ti.lottery.tickets.Tickets;
import ch.bfh.ti.lottery.tickets.Tickets.Ticket;

/**
 * Created by alain on 01.06.14.
 */
public class DrawStatistics {

    private int tot5NumOkAnd2StarOk = 0;
    private int tot5NumOkAnd1StarOk = 0;
    private int tot5NumOkAnd0StarOk = 0;
    private int tot4NumOkAnd2StarOk = 0;
    private int tot4NumOkAnd1StarOk = 0;
    private int tot4NumOkAnd0StarOk = 0;
    private int tot3NumOkAnd2StarOk = 0;
    private int tot2NumOkAnd2StarOk = 0;
    private int tot3NumOkAnd1StarOk = 0;
    private int tot3NumOkAnd0StarOk = 0;
    private int tot1NumOkAnd2StarOk = 0;
    private int tot2NumOkAnd1StarOk = 0;
    private int tot2NumOkAnd0StarOk = 0;

    private boolean isDrawn = false;

    int correctSuperStars = 0;

    public DrawStatistics() {
    }

    
    public void drawLottery(Tickets lotteryTickets,
                            String[] luckySuperStars,
                            int[] luckyNumbers,
                            int[] luckyStars) {

        if (!isDrawn) {
            int checkedTickets = 0;
            correctSuperStars = 0;
            for (Tickets.Ticket tic : lotteryTickets.getTicket()) {

                if (tic.getDrawn() < tic.getValidity()) {

                    for (Tickets.Ticket.Plays.Play play : tic.getPlays().getPlay()) {

                        int correctNum = 0;
                        int correctStars = 0;

                        correctNum = compareNumbers(play, luckyNumbers);
                        
                        correctStars = compareStars(play, luckyStars);

                        
                        switch (correctNum) {
                            case 1: {
                                switch (correctStars) {
                                    case 2: {
                                        tot1NumOkAnd2StarOk++;
                                        break;
                                    }
                                    default: {
                                        break;
                                    }
                                }
                                break;
                            }
                            case 2: {
                                switch (correctStars) {
                                    case 1: {
                                        tot2NumOkAnd1StarOk++;
                                        break;
                                    }
                                    case 2: {
                                        tot2NumOkAnd2StarOk++;
                                        break;
                                    }
                                    default: {
                                        tot2NumOkAnd0StarOk++;
                                        break;
                                    }
                                }
                                break;
                            }
                            case 3: {
                                switch (correctStars) {
                                    case 1: {
                                        tot3NumOkAnd1StarOk++;
                                        break;
                                    }
                                    case 2: {
                                        tot3NumOkAnd2StarOk++;
                                        break;
                                    }
                                    default: {
                                        tot3NumOkAnd0StarOk++;
                                        break;
                                    }
                                }
                                break;
                            }
                            case 4: {
                                switch (correctStars) {
                                    case 1: {
                                        tot4NumOkAnd1StarOk++;
                                        break;
                                    }
                                    case 2: {
                                        tot4NumOkAnd2StarOk++;
                                        break;
                                    }
                                    default: {
                                        tot4NumOkAnd0StarOk++;
                                        break;
                                    }
                                }
                                break;
                            }
                            case 5: {
                                switch (correctStars) {
                                    case 1: {
                                        tot5NumOkAnd1StarOk++;
                                        break;
                                    }
                                    case 2: {
                                        tot5NumOkAnd2StarOk++;
                                        break;
                                    }
                                    default: {
                                        tot5NumOkAnd0StarOk++;
                                        break;
                                    }
                                }
                                break;
                            }
                            default: {
                                break;
                            }
                        }
                    }

                    correctSuperStars += compareSuperStars(tic, luckySuperStars);
                   
                    
                    tic.setDrawn(tic.getDrawn() + 1);
                    checkedTickets++;
                }
            }
            //System.out.println("");
            //	System.out.println("Checked Tickets in this draw: " + checkedTickets);
            isDrawn = true;
        }
    }


    public int compareSuperStars(Ticket tic, String[] luckySuperStars) {
    	int correct = 0;
    	for (Tickets.Ticket.SuperStars.SuperStar superStars : tic.getSuperStars().getSuperStar()) {

            if (superStars.isSelected()) {
                for (int i = 0; i < luckySuperStars.length; i++) {
                    if (luckySuperStars[i].toUpperCase().equals(superStars.getValue().toUpperCase())) {
                        correct++;
                    }
                }
            }
        }
		return correct;
	}


	public int compareStars(Play play, int[] luckyStars) {
    	int correct = 0;
    	for (Integer star : play.getStars().getStar()) {
            for (int i = 0; i < luckyStars.length; i++) {
                if (luckyStars[i] == star) {
                    correct++;
                }
            }
        }
    	return correct;
	}


	public int compareNumbers(Play play, int[] luckyNumbers) {
		int correct = 0;
    	for (Integer num : play.getNumbers().getNumber()) {

        for (int i = 0; i < luckyNumbers.length; i++) {
            if (luckyNumbers[i] == num) {
                correct++;
            }
        }
    }
		return correct;
	}


	public void printStatistics() {
        System.out.println("");
        System.out.println("5 + ** : " + tot5NumOkAnd2StarOk);
        System.out.println("5 + *  : " + tot5NumOkAnd1StarOk);
        System.out.println("5      : " + tot5NumOkAnd0StarOk);
        System.out.println("4 + ** : " + tot4NumOkAnd2StarOk);
        System.out.println("4 + *  : " + tot4NumOkAnd1StarOk);
        System.out.println("4      : " + tot4NumOkAnd0StarOk);
        System.out.println("3 + ** : " + tot3NumOkAnd2StarOk);
        System.out.println("2 + ** : " + tot2NumOkAnd2StarOk);
        System.out.println("3 + *  : " + tot3NumOkAnd1StarOk);
        System.out.println("3      : " + tot3NumOkAnd0StarOk);
        System.out.println("1 + ** : " + tot1NumOkAnd2StarOk);
        System.out.println("2 + *  : " + tot2NumOkAnd1StarOk);
        System.out.println("2      : " + tot2NumOkAnd0StarOk);
        System.out.println("");
        System.out.println("Super* : " + correctSuperStars);

    }

    public int[] getStatistics() {

        int list[] = new int[14];
        list[0] = tot5NumOkAnd2StarOk;
        list[1] = tot5NumOkAnd1StarOk;
        list[2] = tot5NumOkAnd0StarOk;
        list[3] = tot4NumOkAnd2StarOk;
        list[4] = tot4NumOkAnd1StarOk;
        list[5] = tot4NumOkAnd0StarOk;
        list[6] = tot3NumOkAnd2StarOk;
        list[7] = tot2NumOkAnd2StarOk;
        list[8] = tot3NumOkAnd1StarOk;
        list[9] = tot3NumOkAnd0StarOk;
        list[10] = tot1NumOkAnd2StarOk;
        list[11] = tot2NumOkAnd1StarOk;
        list[12] = tot2NumOkAnd0StarOk;
        list[13] = correctSuperStars;

        return list;
    }
}
