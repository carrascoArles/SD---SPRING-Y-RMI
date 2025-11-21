graph TB
    subgraph "CAPA DE APLICACIÓN"
        UI[🎨 Jetpack Compose UI]
        VM[📦 ViewModel]
        REPO[🗄️ Repository]
    end
    
    subgraph "SCOPES DE CICLO DE VIDA"
        VMS[viewModelScope<br/>⏱️ Vinculado a ViewModel]
        LCS[lifecycleScope<br/>⏱️ Vinculado a Activity/Fragment]
        CS[CoroutineScope<br/>⏱️ Scope personalizado]
    end
    
    subgraph "FRAMEWORK DE COROUTINES"
        COR[⚡ Coroutines<br/>Hilos virtuales ligeros]
        
        subgraph "DISPATCHERS"
            MAIN[Dispatchers.Main<br/>🎯 UI Thread]
            IO[Dispatchers.IO<br/>💾 I/O Operations]
            DEF[Dispatchers.Default<br/>⚙️ CPU-intensive]
            UNCONF[Dispatchers.Unconfined<br/>🔓 Sin restricción]
        end
        
        WC[withContext&#40;&#41;<br/>🔄 Cambio de contexto]
        LAUNCH[launch&#123;&#125;<br/>🚀 Lanza coroutine]
        ASYNC[async/await<br/>⚡ Concurrencia]
    end
    
    subgraph "CAPA DE HILOS DEL SISTEMA"
        MT[Main Thread / UI Thread<br/>🎨 Dibuja UI<br/>📱 Eventos de usuario<br/>⚠️ No bloquear!]
        WT[Worker Threads<br/>💪 Operaciones pesadas<br/>🌐 Red, BD, archivos<br/>⚙️ Procesamiento]
    end
    
    subgraph "TAREAS EN SEGUNDO PLANO"
        WM[WorkManager<br/>⏰ Tareas garantizadas<br/>📦 Sobrevive a cierre de app<br/>🔄 Sincronización]
    end
    
    subgraph "OPERACIONES TÍPICAS"
        NET[🌐 Llamadas de Red]
        DB[💾 Base de Datos]
        FILE[📄 Archivos]
        PROC[⚙️ Procesamiento CPU]
    end
    
    %% Relaciones principales
    UI --> VM
    VM --> VMS
    UI -.-> LCS
    
    VMS --> LAUNCH
    LCS --> LAUNCH
    CS --> LAUNCH
    
    LAUNCH --> COR
    ASYNC --> COR
    
    COR --> WC
    WC --> MAIN
    WC --> IO
    WC --> DEF
    
    MAIN --> MT
    IO --> WT
    DEF --> WT
    UNCONF -.-> MT
    UNCONF -.-> WT
    
    VM --> REPO
    REPO --> IO
    REPO --> DEF
    
    IO --> NET
    IO --> DB
    IO --> FILE
    DEF --> PROC
    
    WM --> WT
    
    MT --> UI
    
    %% Estilos
    classDef scopeClass fill:#e1f5ff,stroke:#01579b,stroke-width:3px
    classDef dispatcherClass fill:#fff3e0,stroke:#e65100,stroke-width:2px
    classDef threadClass fill:#f3e5f5,stroke:#4a148c,stroke-width:3px
    classDef coroutineClass fill:#e8f5e9,stroke:#1b5e20,stroke-width:2px
    classDef operationClass fill:#fce4ec,stroke:#880e4f,stroke-width:2px
    
    class VMS,LCS,CS scopeClass
    class MAIN,IO,DEF,UNCONF dispatcherClass
    class MT,WT threadClass
    class COR,WC,LAUNCH,ASYNC coroutineClass
    class NET,DB,FILE,PROC operationClass
