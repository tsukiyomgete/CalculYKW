package com.ykwshowdown.yokai;

public class Inspirit {

    String _nom;
    String _description;
    double _strInspirit;
    double _sprInspirit;
    double _defInspirit;
    double _speInspirit;
    boolean _targetAllies;
    boolean _isDisableActing; // loafing : ne peut pas agir
    boolean _isConfused; // confusion : attaque ses alliés
    boolean _canDamageOverTime;
    double _numberOverTime; // % des HP max par tour
    boolean _canHealAllies;

    public Inspirit(String nom, String description,
            double strI, double sprI, double defI, double speI,
            boolean targetAllies,
            boolean isDisableActing, boolean isConfused,
            boolean canDamageOverTime, double damageOverTime, boolean canHealAllies) {
        _nom = nom;
        _description = description;
        _strInspirit = strI;
        _sprInspirit = sprI;
        _defInspirit = defI;
        _speInspirit = speI;
        _targetAllies = targetAllies;
        _isDisableActing = isDisableActing;
        _isConfused = isConfused;
        _canDamageOverTime = canDamageOverTime;
        _numberOverTime = damageOverTime;
        _canHealAllies = canHealAllies;
    }

    public String getNom() {
        return _nom;
    }

    public String getDescription() {
        return _description;
    }

    public double getSTRInspirit() {
        return _strInspirit;
    }

    public double getSPRInspirit() {
        return _sprInspirit;
    }

    public double getDEFInspirit() {
        return _defInspirit;
    }

    public double getSPEInspirit() {
        return _speInspirit;
    }

    public boolean isTargetAllies() {
        return _targetAllies;
    }

    public boolean isDisableActing() {
        return _isDisableActing;
    }

    public boolean isConfusingEnemy() {
        return _isConfused;
    }

    public boolean canDamageOverTime() {
        return _canDamageOverTime;
    }

    public double getNumberOverTime() {
        return _numberOverTime;
    }

    public boolean canHealAllies()
    {
        return _canHealAllies;
    }
}