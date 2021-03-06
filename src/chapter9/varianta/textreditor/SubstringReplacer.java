package chapter9.varianta.textreditor;

import helper.io.IOHelper;
import helper.properties.PropertiesEnum;

public class SubstringReplacer {
    public void replace(String oldSubstring, String newSubstring) {
        IOHelper ioHelper = new IOHelper();
        String result = ioHelper.readFromFile(PropertiesEnum.INPUT_FILE.getPath())
                .replaceAll(oldSubstring, newSubstring);
        ioHelper.writeToFile(PropertiesEnum.OUTPUT_FILE.getPath(), result);

    }
}
