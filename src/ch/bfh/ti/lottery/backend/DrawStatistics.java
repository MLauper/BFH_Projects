package ch.bfh.ti.lottery.backend;

import ch.bfh.ti.lottery.tickets.Tickets;

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

    int correctSuperStars = 0;

    public DrawStatistics() {
    }


    public void drawLottery(Tickets lotteryTickets,
                            String[] luckySuperStars,
                            int[] luckyNumbers,
                            int[] luckyStars) {

        int checkedTickets = 0;

        for (Tickets.Ticket tic : lotteryTickets.getTicket()) {

            if (tic.getDrawn() < tic.getValidity()) {

                for (Tickets.Ticket.Plays.Play play : tic.getPlays().getPlay()) {

                    int correctNum = 0;
                    int correctStars = 0;

                    for (Integer num : play.getNumbers().getNumber()) {

                        for (int i = 0; i < luckyNumbers.length; i++) {
                            if (luckyNumbers[i] == num) {
                                correctNum++;
                            }
                        }
                    }

                    for (Integer star : play.getStars().getStar()) {
                        for (int i = 0; i < luckyStars.length; i++) {
                            if (luckyStars[i] == star) {
                                correctStars++;
                            }
                        }
                    }
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

                for (Tickets.Ticket.SuperStars.SuperStar superStars : tic.getSuperStars().getSuperStar()) {

                    if (superStars.isSelected()) {
                        for (int i = 0; i < luckySuperStars.length; i++) {
                            if (luckySuperStars[i].toUpperCase().equals(superStars.getValue().toUpperCase())) {
                                correctSuperStars++;
                            }
                        }
                    }
                }
                tic.setDrawn(tic.getDrawn() + 1);
                checkedTickets++;
            }
        }
        System.out.println("");
        System.out.println("Checked Tickets in this draw: " + checkedTickets);
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
}
