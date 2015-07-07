//
//  BaseStats.h
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface BaseStats : NSObject{
    int intelligence;
    int creativity;
    int personality;
    int ambition;
    int luck;
    int physique;
    int enthusiasm;
}

// getter methods
-(int)getIntelligence;
-(int)getCreativity;
-(int)getPersonality;
-(int)getAmbition;
-(int)getLuck;
-(int)getPhysique;
-(int)getEnthusiasm;

// setter methods
-(void)setIntelligence:(int)value;
-(void)setCreativity:(int)value;
-(void)setPersonality:(int)value;
-(void)setAmbition:(int)value;
-(void)setLuck:(int)value;
-(void)setPhysique:(int)value;
-(void)setEnthusiasm:(int)value;

@end
