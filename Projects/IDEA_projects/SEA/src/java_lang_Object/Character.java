package java_lang_Object;

import static java.lang.Character.getNumericValue;

public class Character {
    char content;

    public char getContent() {
        return content;
    }

    public void setContent(char content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) // null check
        {
            return false;
        }
        if (this == obj) // self check
        {
            return true;
        }
        if (getClass() != obj.getClass()) {// class type check
            System.out.println("Objects of different classes");
            return false;
        }
        if (this.hashCode() != obj.hashCode()) // hash code check
        {
            return false;
        }
        // type check and cast
        Character character = (Character) obj; // cast to
        return Objects.equals(content, character.content);
    }

    public int hashCode () {
        return (getNumericValue(content));
        //return (content);
    }
}
