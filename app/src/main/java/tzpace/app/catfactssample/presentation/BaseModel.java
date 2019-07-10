package tzpace.app.catfactssample.presentation;

import androidx.annotation.NonNull;

public abstract class BaseModel<V extends IBaseView> {

    public abstract void setView(final @NonNull V view);

    public abstract void removeView();
}
