package com.company;

import java.sql.Date;

public class Main
{
    public static void main(String[] args)
    {

    }
}

class DateClass {

    int day, month, year;

    public DateClass() {

    }

    public DateClass(int month, int day, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public DateClass(int mmddyyyy) {
        int m, d, y;
        m = mmddyyyy / 1000000;
        d = mmddyyyy / 10000 % 100;
        y = mmddyyyy % 10000;
        if ((m == 2 && d > 28) || (m == 1 && m > 31) || (m > 2 && (m - 3) % 2 == 0 && d > 31) || ((m - 4) % 2 == 0 && d > 30)) {
            m = 0;
            d = 0;
            y = 0;
            System.out.println("Invalid Date");
        }
        this.month = m;
        this.day = d;
        this.year = y;
    }

    public String get() {
        return month + "," + day + "," + year;
    }

    public void set(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String monthName() {
        String[] month = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return month[this.month];
    }

    public String toStr() {
        String str = monthName() + "," + day + "," + year;
        return str;
    }

    public boolean isLastDayOfMonth() {
        int m = this.month;
        int d = this.day;
        if (m == 2 && d == 28)
            return true;
        if (m == 2 && d != 28)
            return false;
        if (m == 1 && d == 31)
            return true;
        if (m == 1 && d != 31)
            return false;
        if ((m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && d == 31)
            return true;
        if ((m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && d != 31)
            return false;
        if ((m == 4 || m == 6 || m == 9 || m == 8 || m == 11) && d == 30)
            return true;
        if ((m == 4 || m == 6 || m == 9 || m == 8 || m == 11) && d != 30)
            return false;
        return false;
    }

    public boolean isBefore(DateClass d) {
        if (d.year < this.year)
            return true;
        if (d.year == this.year) {
            if (d.month < this.month)
                return true;
            if (d.month == this.month) {
                if (d.day < this.day)
                    return true;
                if (d.day == this.day)
                    return false;
            }
        }
        return false;
    }

    public boolean isAfter(DateClass d) {
        if (isBefore(d) == false)
            return true;
        else
            return false;
    }

    public boolean isSameDate(DateClass d) {
        if (d.year == year && d.month == month && d.day == day)
            return true;
        else return false;
    }

    public boolean isLeapYear() {
        return false;
    }

    public DateClass nextDate() {
        DateClass d = new DateClass();
        if (month == 12 && day == 31) {
            d.month = 1;
            d.day = 1;
            d.year = this.year + 1;
            return d;
        }
        if (month != 12 && isLastDayOfMonth() == true) {
            d.month += 1;
            d.day = 1;
            d.year = this.year;
            return d;
        }
        d.month = this.month;
        d.day += 1;
        d.year = this.year;
        return d;
    }

    public DateClass prevDate() {
        int m = month;
        int d = day;
        DateClass d1 = new DateClass();
        if (month == 1 && day == 1) {
            d1.month = 12;
            d1.day = 31;
            d1.year = this.year - 1;
            return d1;
        }
        if (month != 1 && day == 1) {
            d1.month -= 1;
            d = d - 1;
            if (m == 2)
                d1.day = 28;
            if (m == 1)
                d1.day = 31;
            if ((m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12))
                d1.day = 31;
            if ((m == 4 || m == 6 || m == 9 || m == 8 || m == 11) && d == 30)
                d1.day = 30;
            d1.year = this.year;
            return d1;
        }
        d1.month = this.month;
        d1.day -= 1;
        d1.year = this.year;
        return d1;
    }

    public int daysApart(DateClass d) {
        int days = 0;
        while (isBefore(d) == true) {
            nextDate();
            days += 1;
            if (isSameDate(d) == true)
                break;
        }
        return days;
    }

    public int dayOfTheYear() {
        int days = -1;
        DateClass firstDay = new DateClass(1, 1, this.year);
        while (isAfter(firstDay)) {
            prevDate();
            days += 1;
            if (isSameDate(firstDay))
                break;
        }
        return days;
    }

    public int daysLeftInMonth() {
        int days = 0;
        int m = this.month;
        DateClass d = new DateClass(this.month, 0, this.year);
        if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12))
            d.day = 31;
        if (m == 2)
            d.day = 28;
        if (m == 4 || m == 6 || m == 9 || m == 8 || m == 11)
            d.day = 30;
        while (isBefore(d)) {
            nextDate();
            days += 1;
            if (isSameDate(d))
                break;
        }
        return days;
    }

    public int daysLeftInYear() {
        int days = 0;
        DateClass d = new DateClass(12, 31, this.year);
        while (isBefore(d)) {
            nextDate();
            days += 1;
        }
        return days;
    }

    public int daysLeftInDecade()
    {
        int days = 0;
        int decade = (this.year/100*100) + (this.year%100/10 + 1)*10;
        DateClass d = new DateClass(1, 1, decade);
        days += (decade - (this.year + 1)) * 360;
        days += daysLeftInYear();
        return days;
    }

    public int daysLeftInCentury()
    {
        int days = 0;
        int century = (this.year/1000*1000) + (this.year%1000/100 + 1)*100;
        DateClass d = new DateClass(1,1, century);
        days += (century - (this.year + 1)) * 360;
        days += daysLeftInYear();
        return days;
    }

    public DateClass earlierDate(DateClass d)
    {
        DateClass date = new DateClass(this.month, this.day, this.year);
        if(isBefore(d) == true)
            return date;
        else
            return d;
    }

    public DateClass laterDate(DateClass d)
    {
        DateClass date = new DateClass(this.month, this.day, this.year);
        if(isBefore(d) == true)
            return d;
        else
            return date;
    }


}
