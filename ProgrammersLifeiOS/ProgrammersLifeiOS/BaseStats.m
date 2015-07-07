//
//  BaseStats.m
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import "BaseStats.h"

@implementation BaseStats

-(id)init{
    if(self = [super init]){
        intelligence = 1;
        creativity = 1;
        personality = 1;
        ambition = 1;
        luck = 1;
        physique = 1;
        enthusiasm = 1;
    }
    return self;
}

// getter methods
-(int)getIntelligence { return intelligence; }
-(int)getCreativity { return creativity; }
-(int)getPersonality { return personality; }
-(int)getAmbition { return ambition; }
-(int)getLuck { return luck; }
-(int)getPhysique { return physique; }
-(int)getEnthusiasm { return enthusiasm; }

// setter methods
-(void)setIntelligence:(int)value { intelligence = value; }
-(void)setCreativity:(int)value { creativity = value; }
-(void)setPersonality:(int)value { personality = value; }
-(void)setAmbition:(int)value { ambition = value; }
-(void)setLuck:(int)value { luck = value; }
-(void)setPhysique:(int)value { physique = value; }
-(void)setEnthusiasm:(int)value { enthusiasm = value; }

@end