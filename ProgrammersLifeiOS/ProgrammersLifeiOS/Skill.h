//
//  Skill.h
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "SkillRequirement.h"

@interface Skill : NSObject{
    NSMutableArray *requirements;
    NSString *name;
    int level;
    int currentPts;
    int ptsToGo;
    BOOL unlocked;
}

-(void)levelUp;
-(void)unlock;
-(BOOL)checkRequirements;

// getter methods
-(NSMutableArray*)getRequirements;
-(NSString*)getName;
-(int)getLevel;
-(int)getCurrentPts;
-(int)getPtsToGo;
-(BOOL)getUnlocked;

// setter methods
-(void)setRequirements:(NSMutableArray*)value;
-(void)setName:(NSString*)value;
-(void)setLevel:(int)value;
-(void)setCurrentPts:(int)value;
-(void)setPtsToGo:(int)value;
-(void)setUnlocked:(BOOL)value;

@end
