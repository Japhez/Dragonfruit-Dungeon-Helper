package character.classes;

import character.proficiencies.ArmorProficiency;
import character.proficiencies.WeaponProficiency;
import enumerations.AbilityScore;
import enumerations.Alignment;
import enumerations.CasterType;
import enumerations.Skill;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Provides access to change class values. This should only be used by the Class
 * Editor App.
 *
 * @author Japhez
 */
public class MutableCharacterClass extends CharacterClass implements Serializable {

    public MutableCharacterClass(String name) {
        super(name);
    }

    public void setPrimaryAttribute(AbilityScore primaryAttribute) {
        this.primaryAttribute = primaryAttribute;
    }

    public void clearSpellCasterData() {
        spellList = null;
        spellsPerDay = null;
    }

    public void setSpellsPerDay(ClassSpellsPerDay spellsPerDay) {
        this.spellsPerDay = spellsPerDay;
    }

    public void initSpellCasterFields() {
        spellList = new ClassSpellList();
        spellsPerDay = new ClassSpellsPerDay();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitDie(int hitDie) {
        this.hitDie = hitDie;
    }

    public void setClassSkills(Skill[] classSkills) {
        this.classSkills = classSkills;
    }

    public void setArmorProficiencies(ArmorProficiency[] armorProficiencies) {
        this.armorProficiencies = armorProficiencies;
    }

    public void setWeaponProficiencies(WeaponProficiency[] weaponProficiencies) {
        this.weaponProficiencies = weaponProficiencies;
    }

    public void setRestrictedAlignments(ArrayList<Alignment> restrictedAlignments) {
        this.restrictedAlignments = restrictedAlignments;
    }

    public void setStartingGold(StartingGold startingGold) {
        this.startingGold = startingGold;
    }

    public void setCasterType(CasterType casterType) {
        this.casterType = casterType;
    }

    public void setUsesAbilities(boolean usesAbilities) {
        this.usesAbilities = usesAbilities;
    }

    public void setInitialSkillRankModifier(int initialSkillRankModifier) {
        this.initialSkillRankModifier = initialSkillRankModifier;
    }

    public void setSkillRankModifier(int skillRankModifier) {
        this.skillRankModifier = skillRankModifier;
    }

    public void setLevelDataMap(HashMap<Integer, CharacterClassLevelData> levelDataMap) {
        this.levelDataMap = levelDataMap;
    }

    public void setSpellList(ClassSpellList spellList) {
        this.spellList = spellList;
    }
}
