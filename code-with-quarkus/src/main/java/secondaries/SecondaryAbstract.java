package secondaries;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import main_package.MainService;

public abstract class SecondaryAbstract implements Secondary {

    @Inject
    MainService mainService;

    protected abstract void init();

    @PostConstruct
    protected void initWebClientAndAddImplementationToMap() {
        init();
        mainService.putSecondaryToMap(getName(), this);
    }

    @Override
    public String getDescription() {
        return getName() + "_description";
    }
}
