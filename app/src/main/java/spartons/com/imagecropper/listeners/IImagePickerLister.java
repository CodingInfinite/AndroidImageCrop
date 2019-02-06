package spartons.com.imagecropper.listeners;

import spartons.com.imagecropper.enums.ImagePickerEnum;

/**
 * Ahsen Saeed}
 * ahsansaeed067@gmail.com}
 * 2/6/19}
 */

@FunctionalInterface
public interface IImagePickerLister {
    void onOptionSelected(ImagePickerEnum imagePickerEnum);
}
