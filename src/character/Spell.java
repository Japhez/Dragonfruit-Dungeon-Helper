package character;

import java.io.Serializable;
import java.util.HashMap;

/**
 * A general spell that contains most all the information a spell can contain.
 *
 * @author Jacob Dorman
 */
public class Spell implements Serializable
{

    //The name of this spell
    private String name;
    //The description of this spell
    private String description;
    //The school that this spell belongs to
    private School school;
    /**
     * A HashMap containing the name of each class that can use this spell and
     * the level it is available at.
     */
    private HashMap<String, Integer> classAvailability;
    //Whether or not this spell requires the ability to speak
    private boolean verbal;
    //Whether or not this spell requires a free hand to cast
    private boolean somatic;
    //Whether or not this spell requires a focus
    private boolean focus;
    //How many rounds it takes to cast this spell (0 is a free action)
    private String castingTime;
    //The target type of this spell
    private String target;
    //The duration of this spell
    private String duration;
    //The saving throw vs. this spell
    private String savingThrow;
    //Spell resistance
    private String spellResistance;
    //How much experience this spell costs to cast
    private int experienceCost;
    //How much gold this spell costs to cast
    private int goldCost;
    //The number of dice this spell throws
    private int diceNumber;
    //The sides of the dice that are thrown
    private int diceSides;
    //The last used modififier for the roll result
    private int lastModifier;

    public Spell(String spellName)
    {
        this.name = spellName;
    }
    
    public boolean isRollable() {
        return (diceNumber > 0 && diceSides > 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public HashMap<String, Integer> getClassAvailability() {
        return classAvailability;
    }

    public void setClassAvailability(HashMap<String, Integer> classAvailability) {
        this.classAvailability = classAvailability;
    }

    public boolean isVerbal() {
        return verbal;
    }

    public void setVerbal(boolean verbal) {
        this.verbal = verbal;
    }

    public boolean isSomatic() {
        return somatic;
    }

    public void setSomatic(boolean somatic) {
        this.somatic = somatic;
    }

    public boolean isFocus() {
        return focus;
    }

    public void setFocus(boolean focus) {
        this.focus = focus;
    }

    public String getCastingTime() {
        return castingTime;
    }

    public void setCastingTime(String castingTime) {
        this.castingTime = castingTime;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSavingThrow() {
        return savingThrow;
    }

    public void setSavingThrow(String savingThrow) {
        this.savingThrow = savingThrow;
    }

    public String getSpellResistance() {
        return spellResistance;
    }

    public void setSpellResistance(String spellResistance) {
        this.spellResistance = spellResistance;
    }

    public int getExperienceCost() {
        return experienceCost;
    }

    public void setExperienceCost(int experienceCost) {
        this.experienceCost = experienceCost;
    }

    public int getGoldCost() {
        return goldCost;
    }

    public void setGoldCost(int goldCost) {
        this.goldCost = goldCost;
    }

    public int getDiceNumber() {
        return diceNumber;
    }

    public void setDiceNumber(int diceNumber) {
        this.diceNumber = diceNumber;
    }

    public int getDiceSides() {
        return diceSides;
    }

    public void setDiceSides(int diceSides) {
        this.diceSides = diceSides;
    }

    public int getLastModifier() {
        return lastModifier;
    }

    public void setLastModifier(int lastModifier) {
        this.lastModifier = lastModifier;
    }

    /**
     * An enumeration of the schools of spells that exist.
     */
    public enum School
    {

        ABJURATION, CONJURATION, DIVINATION, ENCHANTMENT, EVOCATION, ILLUSION,
        NECROMANCY, TRANSMUTATION, UNIVERSAL;

        /**
         * Override for toString that returns the enumeration with the first
         * letter capitalized, and the rest lower case.
         * http://javahowto.blogspot.com/2006/10/custom-string-values-for-enum.html?showComment=1240529040000#c6158717620626337359
         *
         * @return the enumeration with the first letter capitalized, and the
         * rest lower case.
         */
        @Override
        public String toString()
        {
            String output = name().toString();
            output = output.charAt(0) + output.substring(1).toLowerCase();
            return output;
        }

        /**
         * @return an ArrayList of the spell schools
         */
        public static School[] getSchools()
        {
            return new School[]
                    {
                        ABJURATION, CONJURATION, DIVINATION,
                        ENCHANTMENT, EVOCATION, ILLUSION, NECROMANCY, TRANSMUTATION, UNIVERSAL
                    };
        }
    }

    /**
     * An enumeration of the types of basic types of spells that exist.
     */
    public enum SpellType
    {

        UTILITY, ATTACK, DEFENSIVE;

        /**
         * Override for toString that returns the enumeration with the first
         * letter capitalized, and the rest lower case.
         * http://javahowto.blogspot.com/2006/10/custom-string-values-for-enum.html?showComment=1240529040000#c6158717620626337359
         *
         * @return the enumeration with the first letter capitalized, and the
         * rest lower case.
         */
        @Override
        public String toString()
        {
            String output = name().toString();
            output = output.charAt(0) + output.substring(1).toLowerCase();
            return output;
        }
    }
}
