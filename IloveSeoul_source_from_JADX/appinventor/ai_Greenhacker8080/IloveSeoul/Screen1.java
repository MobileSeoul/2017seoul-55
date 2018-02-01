package appinventor.ai_Greenhacker8080.IloveSeoul;

import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Sharing;
import com.google.appinventor.components.runtime.WebViewer;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.Procedure;
import gnu.mapping.PropertySet;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;

/* compiled from: Screen1.yail */
public class Screen1 extends Form implements Runnable {
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Screen1").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("number").readResolve());
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("Shape").readResolve());
    static final IntNum Lit12 = IntNum.make(1);
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol("ShowFeedback").readResolve());
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final SimpleSymbol Lit15 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve());
    static final IntNum Lit17 = IntNum.make(0);
    static final FString Lit18 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit19 = ((SimpleSymbol) new SimpleSymbol("Visible").readResolve());
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final SimpleSymbol Lit20 = ((SimpleSymbol) new SimpleSymbol("Label1").readResolve());
    static final SimpleSymbol Lit21 = ((SimpleSymbol) new SimpleSymbol("Button1$Click").readResolve());
    static final SimpleSymbol Lit22 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final FString Lit23 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit24 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final IntNum Lit25 = IntNum.make(15);
    static final SimpleSymbol Lit26 = ((SimpleSymbol) new SimpleSymbol("HTMLFormat").readResolve());
    static final IntNum Lit27 = IntNum.make(2);
    static final FString Lit28 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit29 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final SimpleSymbol Lit30 = ((SimpleSymbol) new SimpleSymbol("Button2").readResolve());
    static final FString Lit31 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit32 = ((SimpleSymbol) new SimpleSymbol("WebViewer1").readResolve());
    static final SimpleSymbol Lit33 = ((SimpleSymbol) new SimpleSymbol("GoToUrl").readResolve());
    static final PairWithPosition Lit34;
    static final SimpleSymbol Lit35 = ((SimpleSymbol) new SimpleSymbol("Button2$Click").readResolve());
    static final FString Lit36 = new FString("com.google.appinventor.components.runtime.WebViewer");
    static final SimpleSymbol Lit37 = ((SimpleSymbol) new SimpleSymbol("UsesLocation").readResolve());
    static final FString Lit38 = new FString("com.google.appinventor.components.runtime.WebViewer");
    static final FString Lit39 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit4;
    static final SimpleSymbol Lit40 = ((SimpleSymbol) new SimpleSymbol("Button3").readResolve());
    static final FString Lit41 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit42 = ((SimpleSymbol) new SimpleSymbol("Label2").readResolve());
    static final SimpleSymbol Lit43 = ((SimpleSymbol) new SimpleSymbol("Button3$Click").readResolve());
    static final FString Lit44 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit45 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit46 = new FString("com.google.appinventor.components.runtime.Image");
    static final SimpleSymbol Lit47 = ((SimpleSymbol) new SimpleSymbol("Image1").readResolve());
    static final SimpleSymbol Lit48 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit49 = IntNum.make(-2);
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final SimpleSymbol Lit50 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final SimpleSymbol Lit51 = ((SimpleSymbol) new SimpleSymbol("Picture").readResolve());
    static final SimpleSymbol Lit52 = ((SimpleSymbol) new SimpleSymbol("ScalePictureToFit").readResolve());
    static final FString Lit53 = new FString("com.google.appinventor.components.runtime.Image");
    static final FString Lit54 = new FString("com.google.appinventor.components.runtime.Sharing");
    static final SimpleSymbol Lit55 = ((SimpleSymbol) new SimpleSymbol("Sharing1").readResolve());
    static final FString Lit56 = new FString("com.google.appinventor.components.runtime.Sharing");
    static final SimpleSymbol Lit57 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit58 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit59 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final FString Lit6 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit60 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit61 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit62 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit63 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit64 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit65 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit66 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit67 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit68 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol("Button1").readResolve());
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("FontSize").readResolve());
    static final IntNum Lit9 = IntNum.make(20);
    public static Screen1 Screen1;
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Button Button1;
    public final ModuleMethod Button1$Click;
    public Button Button2;
    public final ModuleMethod Button2$Click;
    public Button Button3;
    public final ModuleMethod Button3$Click;
    public Image Image1;
    public Label Label1;
    public Label Label2;
    public Sharing Sharing1;
    public WebViewer WebViewer1;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    /* compiled from: Screen1.yail */
    public class frame extends ModuleBody {
        Screen1 $main = this;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 3:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 10:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 11:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 12:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod, obj, callContext);
            }
        }

        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 2:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 3:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 6:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 7:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 9:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 14:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
            }
        }

        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 8:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case 13:
                    if (!(obj instanceof Screen1)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    if (!(obj4 instanceof String)) {
                        return -786428;
                    }
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case 1:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case 3:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "lookup-in-form-environment", 1, obj);
                    }
                case 5:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "is-bound-in-form-environment", 1, obj);
                    }
                case 10:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case 11:
                    this.$main.sendError(obj);
                    return Values.empty;
                case 12:
                    this.$main.processException(obj);
                    return Values.empty;
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            switch (moduleMethod.selector) {
                case 8:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case 13:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj, (String) obj2, (String) obj3, (Object[]) obj4) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    throw new WrongType(e, "dispatchEvent", 4, obj4);
                                }
                            } catch (ClassCastException e2) {
                                throw new WrongType(e2, "dispatchEvent", 3, obj3);
                            }
                        } catch (ClassCastException e22) {
                            throw new WrongType(e22, "dispatchEvent", 2, obj2);
                        }
                    } catch (ClassCastException e222) {
                        throw new WrongType(e222, "dispatchEvent", 1, obj);
                    }
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case 2:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case 3:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 6:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e22) {
                        throw new WrongType(e22, "add-to-global-var-environment", 1, obj);
                    }
                case 7:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case 9:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case 14:
                    return this.$main.lookupHandler(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 15:
                    return Screen1.lambda2();
                case 16:
                    this.$main.$define();
                    return Values.empty;
                case 17:
                    return Screen1.lambda3();
                case 18:
                    return Screen1.lambda4();
                case 19:
                    return Screen1.lambda5();
                case 20:
                    return this.$main.Button1$Click();
                case 21:
                    return Screen1.lambda6();
                case 22:
                    return Screen1.lambda7();
                case 23:
                    return Screen1.lambda8();
                case 24:
                    return Screen1.lambda9();
                case 25:
                    return this.$main.Button2$Click();
                case 26:
                    return Screen1.lambda10();
                case 27:
                    return Screen1.lambda11();
                case 28:
                    return Screen1.lambda12();
                case 29:
                    return Screen1.lambda13();
                case 30:
                    return this.$main.Button3$Click();
                case 31:
                    return Screen1.lambda14();
                case 32:
                    return Screen1.lambda15();
                case 33:
                    return Screen1.lambda16();
                case 34:
                    return Screen1.lambda17();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 15:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 16:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 17:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 18:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 19:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 20:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 21:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 22:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 23:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 24:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 25:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 26:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 27:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 28:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 29:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 30:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 31:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 32:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 33:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 34:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit4 = simpleSymbol;
        Lit34 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1508492528412_0.2190939366865302-0/youngandroidproject/../src/appinventor/ai_Greenhacker8080/IloveSeoul/Screen1.yail", 245872);
    }

    public Screen1() {
        ModuleInfo.register(this);
        ModuleBody appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame = new frame();
        this.android$Mnlog$Mnform = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 1, Lit57, 4097);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 2, Lit58, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 3, Lit59, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 5, Lit60, 4097);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 6, Lit61, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 7, Lit62, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 8, Lit63, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 9, Lit64, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 10, Lit65, 4097);
        this.send$Mnerror = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 11, Lit66, 4097);
        this.process$Mnexception = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 12, "process-exception", 4097);
        this.dispatchEvent = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 13, Lit67, 16388);
        this.lookup$Mnhandler = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 14, Lit68, 8194);
        PropertySet moduleMethod = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 15, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime8446606986221061779.scm:552");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 16, "$define", 0);
        lambda$Fn2 = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 17, null, 0);
        lambda$Fn3 = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 18, null, 0);
        lambda$Fn4 = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 19, null, 0);
        this.Button1$Click = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 20, Lit21, 0);
        lambda$Fn5 = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 21, null, 0);
        lambda$Fn6 = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 22, null, 0);
        lambda$Fn7 = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 23, null, 0);
        lambda$Fn8 = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 24, null, 0);
        this.Button2$Click = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 25, Lit35, 0);
        lambda$Fn9 = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 26, null, 0);
        lambda$Fn10 = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 27, null, 0);
        lambda$Fn11 = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 28, null, 0);
        lambda$Fn12 = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 29, null, 0);
        this.Button3$Click = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 30, Lit43, 0);
        lambda$Fn13 = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 31, null, 0);
        lambda$Fn14 = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 32, null, 0);
        lambda$Fn15 = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 33, null, 0);
        lambda$Fn16 = new ModuleMethod(appinventor_ai_Greenhacker8080_IloveSeoul_Screen1_frame, 34, null, 0);
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        Throwable th;
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext $ctx) {
        Consumer $result = $ctx.consumer;
        Object find = require.find("com.google.youngandroid.runtime");
        try {
            String str;
            ((Runnable) find).run();
            this.$Stdebug$Mnform$St = Boolean.FALSE;
            this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
            FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
            if (stringAppend == null) {
                str = null;
            } else {
                str = stringAppend.toString();
            }
            this.global$Mnvar$Mnenvironment = Environment.make(str);
            Screen1 = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            find = require.find("com.google.youngandroid.runtime");
            try {
                ((Runnable) find).run();
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "IloveSeoul", Lit4);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit5, "Screen1", Lit4), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn2));
                }
                this.Button1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit6, Lit7, lambda$Fn3), $result);
                } else {
                    addToComponents(Lit0, Lit18, Lit7, lambda$Fn4);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit21, this.Button1$Click);
                } else {
                    addToFormEnvironment(Lit21, this.Button1$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button1", "Click");
                } else {
                    addToEvents(Lit7, Lit22);
                }
                this.Label1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit23, Lit20, lambda$Fn5), $result);
                } else {
                    addToComponents(Lit0, Lit28, Lit20, lambda$Fn6);
                }
                this.Button2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit29, Lit30, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit0, Lit31, Lit30, lambda$Fn8);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit35, this.Button2$Click);
                } else {
                    addToFormEnvironment(Lit35, this.Button2$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button2", "Click");
                } else {
                    addToEvents(Lit30, Lit22);
                }
                this.WebViewer1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit36, Lit32, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit0, Lit38, Lit32, lambda$Fn10);
                }
                this.Button3 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit39, Lit40, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit0, Lit41, Lit40, lambda$Fn12);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit43, this.Button3$Click);
                } else {
                    addToFormEnvironment(Lit43, this.Button3$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Button3", "Click");
                } else {
                    addToEvents(Lit40, Lit22);
                }
                this.Label2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit44, Lit42, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit0, Lit45, Lit42, lambda$Fn14);
                }
                this.Image1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit46, Lit47, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit0, Lit53, Lit47, lambda$Fn16);
                }
                this.Sharing1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit54, Lit55, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit56, Lit55, Boolean.FALSE);
                }
                runtime.initRuntime();
            } catch (ClassCastException e) {
                throw new WrongType(e, "java.lang.Runnable.run()", 1, find);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "java.lang.Runnable.run()", 1, find);
        }
    }

    static Object lambda3() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "IloveSeoul", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit5, "Screen1", Lit4);
    }

    static Object lambda4() {
        runtime.setAndCoerceProperty$Ex(Lit7, Lit8, Lit9, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit7, Lit11, Lit12, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit7, Lit13, Boolean.FALSE, Lit14);
        runtime.setAndCoerceProperty$Ex(Lit7, Lit15, "서울시는?", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit7, Lit16, Lit17, Lit10);
    }

    static Object lambda5() {
        runtime.setAndCoerceProperty$Ex(Lit7, Lit8, Lit9, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit7, Lit11, Lit12, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit7, Lit13, Boolean.FALSE, Lit14);
        runtime.setAndCoerceProperty$Ex(Lit7, Lit15, "서울시는?", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit7, Lit16, Lit17, Lit10);
    }

    public Object Button1$Click() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit7, Lit19, runtime.getProperty$1(Lit20, Lit19), Lit14);
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit20, Lit24, Boolean.TRUE, Lit14);
        runtime.setAndCoerceProperty$Ex(Lit20, Lit8, Lit25, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit20, Lit26, Boolean.TRUE, Lit14);
        runtime.setAndCoerceProperty$Ex(Lit20, Lit15, "서울특별시는 대한민국의 수도이자 최대 도시이다.", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit20, Lit16, Lit27, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit20, Lit19, Boolean.FALSE, Lit14);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit20, Lit24, Boolean.TRUE, Lit14);
        runtime.setAndCoerceProperty$Ex(Lit20, Lit8, Lit25, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit20, Lit26, Boolean.TRUE, Lit14);
        runtime.setAndCoerceProperty$Ex(Lit20, Lit15, "서울특별시는 대한민국의 수도이자 최대 도시이다.", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit20, Lit16, Lit27, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit20, Lit19, Boolean.FALSE, Lit14);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit30, Lit8, Lit9, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit30, Lit11, Lit12, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit30, Lit15, "서울특별시청의 홈페이지는?", Lit4);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit30, Lit8, Lit9, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit30, Lit11, Lit12, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit30, Lit15, "서울특별시청의 홈페이지는?", Lit4);
    }

    public Object Button2$Click() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit32, Lit33, LList.list1("http://www.seoul.go.kr/main/index.html"), Lit34);
    }

    static Object lambda10() {
        return runtime.setAndCoerceProperty$Ex(Lit32, Lit37, Boolean.TRUE, Lit14);
    }

    static Object lambda11() {
        return runtime.setAndCoerceProperty$Ex(Lit32, Lit37, Boolean.TRUE, Lit14);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit40, Lit8, Lit9, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit40, Lit15, "서울특별시의 시장은?", Lit4);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit40, Lit8, Lit9, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit40, Lit15, "서울특별시의 시장은?", Lit4);
    }

    public Object Button3$Click() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit40, Lit19, runtime.getProperty$1(Lit42, Lit19), Lit14);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit42, Lit8, Lit9, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit42, Lit15, "박원순 서울시장!", Lit4);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit42, Lit8, Lit9, Lit10);
        return runtime.setAndCoerceProperty$Ex(Lit42, Lit15, "박원순 서울시장!", Lit4);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit47, Lit48, Lit49, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit50, Lit49, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit51, "Seoul.jpg", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit47, Lit52, Boolean.TRUE, Lit14);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit47, Lit48, Lit49, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit50, Lit49, Lit10);
        runtime.setAndCoerceProperty$Ex(Lit47, Lit51, "Seoul.jpg", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit47, Lit52, Boolean.TRUE, Lit14);
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.form$Mnenvironment, object));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol name, Object default$Mnvalue) {
        boolean x = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & 1;
        if (x) {
            if (!this.form$Mnenvironment.isBound(name)) {
                return default$Mnvalue;
            }
        } else if (!x) {
            return default$Mnvalue;
        }
        return this.form$Mnenvironment.get(name);
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.global$Mnvar$Mnenvironment, object));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = lists.cons(lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        RetValManager.sendError(error == null ? null : error.toString());
    }

    public void processException(Object ex) {
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    public boolean dispatchEvent(Component componentObject, String registeredComponentName, String eventName, Object[] args) {
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            return false;
        } else if (lookupInFormEnvironment(registeredObject) != componentObject) {
            return false;
        } else {
            try {
                Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                return true;
            } catch (Throwable exception) {
                androidLogForm(exception.getMessage());
                exception.printStackTrace();
                processException(exception);
                return false;
            }
        }
    }

    public Object lookupHandler(Object componentName, Object eventName) {
        String str = null;
        String obj = componentName == null ? null : componentName.toString();
        if (eventName != null) {
            str = eventName.toString();
        }
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj, str)));
    }

    public void $define() {
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception exception) {
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        Screen1 = this;
        addToFormEnvironment(Lit0, this);
        Object obj = this.events$Mnto$Mnregister;
        while (obj != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = lists.car.apply1(event$Mninfo);
                String obj2 = apply1 == null ? null : apply1.toString();
                Object apply12 = lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj2, apply12 == null ? null : apply12.toString());
                obj = arg0.getCdr();
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, obj);
            }
        }
        addToGlobalVars(Lit2, lambda$Fn1);
        Screen1 closureEnv = this;
        obj = lists.reverse(this.global$Mnvars$Mnto$Mncreate);
        while (obj != LList.Empty) {
            try {
                arg0 = (Pair) obj;
                Object var$Mnval = arg0.getCar();
                Object var = lists.car.apply1(var$Mnval);
                addToGlobalVarEnvironment((Symbol) var, Scheme.applyToArgs.apply1(lists.cadr.apply1(var$Mnval)));
                obj = arg0.getCdr();
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, obj);
            } catch (ClassCastException e22) {
                throw new WrongType(e22, "arg0", -2, obj);
            } catch (ClassCastException e222) {
                throw new WrongType(e222, "add-to-form-environment", 0, component$Mnname);
            } catch (ClassCastException e3) {
                throw new WrongType(e3, "lookup-in-form-environment", 0, apply1);
            } catch (ClassCastException e2222) {
                throw new WrongType(e2222, "arg0", -2, obj);
            } catch (ClassCastException e22222) {
                throw new WrongType(e22222, "arg0", -2, obj);
            } catch (ClassCastException e222222) {
                throw new WrongType(e222222, "add-to-global-var-environment", 0, var);
            } catch (ClassCastException e2222222) {
                throw new WrongType(e2222222, "arg0", -2, obj);
            } catch (YailRuntimeError exception2) {
                processException(exception2);
                return;
            }
        }
        obj = lists.reverse(this.form$Mndo$Mnafter$Mncreation);
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            misc.force(arg0.getCar());
            obj = arg0.getCdr();
        }
        LList component$Mndescriptors = lists.reverse(this.components$Mnto$Mncreate);
        closureEnv = this;
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            Object component$Mninfo = arg0.getCar();
            Object component$Mnname = lists.caddr.apply1(component$Mninfo);
            lists.cadddr.apply1(component$Mninfo);
            Object component$Mnobject = Invoke.make.apply2(lists.cadr.apply1(component$Mninfo), lookupInFormEnvironment((Symbol) lists.car.apply1(component$Mninfo)));
            SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
            addToFormEnvironment((Symbol) component$Mnname, component$Mnobject);
            obj = arg0.getCdr();
        }
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            component$Mninfo = arg0.getCar();
            lists.caddr.apply1(component$Mninfo);
            Boolean init$Mnthunk = lists.cadddr.apply1(component$Mninfo);
            if (init$Mnthunk != Boolean.FALSE) {
                Scheme.applyToArgs.apply1(init$Mnthunk);
            }
            obj = arg0.getCdr();
        }
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            component$Mninfo = arg0.getCar();
            component$Mnname = lists.caddr.apply1(component$Mninfo);
            lists.cadddr.apply1(component$Mninfo);
            callInitialize(SlotGet.field.apply2(this, component$Mnname));
            obj = arg0.getCdr();
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        Object car;
        LList symbols = LList.makeList(argsArray, 0);
        Procedure procedure = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Pair result = LList.Empty;
        Object arg0 = symbols;
        while (arg0 != LList.Empty) {
            try {
                Pair arg02 = (Pair) arg0;
                Object arg03 = arg02.getCdr();
                car = arg02.getCar();
                try {
                    result = Pair.make(misc.symbol$To$String((Symbol) car), result);
                    arg0 = arg03;
                } catch (ClassCastException e) {
                    throw new WrongType(e, "symbol->string", 1, car);
                }
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, arg0);
            }
        }
        car = procedure.apply2(moduleMethod, LList.reverseInPlace(result));
        try {
            return misc.string$To$Symbol((CharSequence) car);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "string->symbol", 1, car);
        }
    }

    static Object lambda2() {
        return null;
    }
}
