graph TD
    A([Start]) --> B[Call buildReprintRequest]
    B --> C[Log: Start ReprintRequestBuilder]
    C --> D[Create StringBuilder]
    D --> E[Call validateReprintRequest]
    
    subgraph Validation Module
        E --> F{Is RequestInfo null?}
        F -->|Yes| G[Add exception: RePrintRequest.RequestInfo]
        F -->|No| H{Is ApplicationId<br>empty/whitespace?}
        H -->|Yes| I[Add exception: RequestInfo.ApplicationId]
        H -->|No| J{Is DocumentNumber<br>empty/whitespace?}
        J -->|Yes| K[Add exception: RePrintRequest.DocumentNumber]
        J -->|No| L[Validation Passed]
    end

    E --> M{Any exceptions?}
    M -->|Yes| N[Throw TicketingProcessV3ApiV1dtnException]
    M -->|No| O[Build Base Request String]
    
    O --> P[Add IPS2 Delimiter]
    P --> Q[Add IPTINS Field]
    Q --> R[Process DocumentNumber]
    R -->|If exists| S[Append DocumentNumber]
    S --> T[Add BLOCK Delimiter]
    T --> U[Call addAppId]
    
    subgraph ApplicationID Handling
        U --> V{Request Type<br>between SSC-SMP?}
        V -->|Yes| W[Prepend Uppercase ApplicationID]
        V -->|No| X[Keep Original String]
    end
    
    X --> Y[Log Processed Request]
    Y --> Z[Log: End buildReprintRequest]
    Z --> AA([Return Request String])
    
    N --> AB([Exception Termination])
    
    style A fill:#90EE90,stroke:#333
    style AA fill:#FFA07A,stroke:#333
    style AB fill:#FFB6C1,stroke:#333
    classDef decision fill:#FFF3B7,stroke:#333,stroke-width:1px;
    class F,H,J,V decision

    %% Connection Fix
    L --> O
    G --> M
    I --> M
    K --> M
    W --> Y
