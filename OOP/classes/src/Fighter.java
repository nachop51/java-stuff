abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }

    @Override
    public String toString() {
        return "Fighter is a " + this.getClass().getSimpleName();
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    int damagePoints(Fighter wizard) {
        if (wizard.isVulnerable())
            return 10;
        return 6;
    }
}

class Wizard extends Fighter {

    public boolean isSpellPrepared = false;

    @Override
    boolean isVulnerable() {
        return !this.isSpellPrepared;
    }

    @Override
    int damagePoints(Fighter warrior) {
        if (this.isSpellPrepared) {
            this.isSpellPrepared = false;
            return 12;
        }
        return 3;
    }

    void prepareSpell() {
        this.isSpellPrepared = true;
    }

}